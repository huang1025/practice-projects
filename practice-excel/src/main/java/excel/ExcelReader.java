package excel;

import com.sun.javafx.binding.StringFormatter;
import javafx.beans.binding.StringExpression;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huang on 17/5/5.
 */
public class ExcelReader {
    private String filePath;
    private String sheetName;

    private Workbook workBook;
    private Sheet sheet;

    public ExcelReader(String filePath, String sheetName) {
        this.filePath = filePath;
        this.sheetName = sheetName;
        this.load();
    }

    private void load() {
        FileInputStream inStream = null;
        try {
            inStream = new FileInputStream(new File(filePath));
            workBook = WorkbookFactory.create(inStream);
            sheet = workBook.getSheet(sheetName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (inStream != null) {
                    inStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

        /** 读取数据到list; */
        ExcelReader reader = new ExcelReader("/Users/admin/Desktop/product.xlsx", "纯线上期缴");
        List<List<String>> list = new ArrayList<List<String>>();
        for (int i = 2; i < 24; i++) {
            List<String> rowList = new ArrayList<String>();
            Row row = reader.sheet.getRow(i);
            for (int j = 1; j < 14; j++) {
                Cell cell = row.getCell(j);
                rowList.add(cell.toString().trim());
            }
            list.add(rowList);
        }

//        getInsertProduct(list);
//        getInsertProductConfig(list);
        getInsertProductLife(list);
    }

    /**
     * 获取 insert product 语句;
     */
    public static void getInsertProduct(List<List<String>> list) {
        String insertSQL = "INSERT INTO PRODUCT (CLASS_NAME, CLASS_TYPE, PRODUCT_CODE, PRODUCT_NAME, OBJECT_CUSTOMERS, STATUS,\n" +
                "MONTHLY_COST, PAYMENT_CALC_TYPE, SINGLE_SERVICEFEE_RATIO, ORDERVALUE, CATEGORY, CLASS_CODE)\n" +
                "VALUES ('百信贷', 'P61', '4029', '百信贷07（Q）', 'X29', 'VALID', 0.69, 'ACI', 0, 323, 'CREDITLOAN', 'P61');";

        insertSQL = "INSERT INTO PRODUCT (CLASS_NAME, CLASS_TYPE, PRODUCT_CODE, PRODUCT_NAME, OBJECT_CUSTOMERS, STATUS,\n" +
                "MONTHLY_COST, PAYMENT_CALC_TYPE, SINGLE_SERVICEFEE_RATIO, ORDERVALUE, CATEGORY, CLASS_CODE)\n" +
                "VALUES ('%s', '%s', '%s', '%s', '%s', 'VALID', %s , 'ACI', 0, %s, 'CREDITLOAN', '%s');";

        int num = 323;
        for (List<String> each : list) {
            StringExpression format = StringFormatter.format(insertSQL,
                    each.get(2).substring(0, 3),
                    ProductJson.getClassType(each.get(2).substring(0, each.get(2).indexOf("（"))),
                    each.get(1),
                    each.get(2),
                    each.get(3),
                    new BigDecimal(each.get(6).substring(0, 6)).multiply(new BigDecimal("100")).toString(),
                    num++,
                    ProductJson.getClassType(each.get(2).substring(0, each.get(2).indexOf("（")))
            );
            System.out.println(format.getValue());
        }
    }

    /**
     * 获取 insert product_config 语句;
     */
    public static void getInsertProductConfig(List<List<String>> list) {
        String insertSQL = "INSERT INTO APPLY_PRODUCT_CONFIG (SOURCE_CHANNEL, SOURCE_SUB_CHANNEL, PRODUCT_CODE, STATUS, PRODUCT_NAME)\n" +
                "VALUES ('Net_Sales_Pure_Online', 'OTHER', '4029', 'VALID', '百信贷07（Q）');";

        insertSQL = "INSERT INTO APPLY_PRODUCT_CONFIG (SOURCE_CHANNEL, SOURCE_SUB_CHANNEL, PRODUCT_CODE, STATUS, PRODUCT_NAME)\n" +
                "VALUES ('Net_Sales_Pure_Online', 'OTHER', '%s', 'VALID', '%s');";

        for (List<String> each : list) {
            StringExpression format = StringFormatter.format(insertSQL,
                    each.get(1),
                    each.get(2)
            );
            System.out.println(format.getValue());
        }
    }

    /**
     * 获取 insert product_life 语句;
     */
    public static void getInsertProductLife(List<List<String>> list) {
        String insertSQL = "INSERT INTO PRODUCT_LIFE (ID, PRODUCT_CODE, LOAN_LIFE, STATUS, PRODUCT_NAME)\n" +
                "VALUES (SYS_GUID(), '4001', 6, 'VALID', '百信贷07');";

        insertSQL = "INSERT INTO PRODUCT_LIFE (ID, PRODUCT_CODE, LOAN_LIFE, STATUS, PRODUCT_NAME)\n" +
                "VALUES (SYS_GUID(), '%s', %s, 'VALID', '%s');";

        Integer[] lifes = {6, 12, 18, 24, 36, 48};
        List<Integer> lifeList = Arrays.asList(lifes);

        for (List<String> each : list) {
            for (Integer eachLife : lifeList) {
                StringExpression format = StringFormatter.format(insertSQL,
                        each.get(1),
                        eachLife,
                        each.get(2)
                );
                System.out.println(format.getValue());
            }
            System.out.println();
        }
    }

}
