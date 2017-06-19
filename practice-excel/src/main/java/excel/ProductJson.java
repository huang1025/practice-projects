package excel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 * Created by huang on 2017/6/16.
 */
public class ProductJson {

    public static String getClassType(String productName) {
        JSONArray jsonArray = JSON.parseArray(json);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject each = jsonArray.getJSONObject(i);
            String product_name = each.getString("PRODUCT_NAME");
            if (product_name.equals(productName)) {
                return each.getString("CLASS_TYPE");
            }
        }
        return null;
    }

    public static String getClassCode(String productCode) {
        JSONArray jsonArray = JSON.parseArray(json);
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject each = jsonArray.getJSONObject(i);
            String product_name = each.getString("PRODUCT_NAME");
            if (product_name.equals(productCode)) {
                return each.getString("PRODUCT_CODE");
            }
        }
        return null;
    }

    public static String json = "[\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信业房产贷\",\n" +
            "    \"CLASS_TYPE\": \"P04\",\n" +
            "    \"PRODUCT_CODE\": \"0003\",\n" +
            "    \"PRODUCT_NAME\": \"信业房产贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A4\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": null,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P04\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信业房产贷\",\n" +
            "    \"CLASS_TYPE\": \"P04\",\n" +
            "    \"PRODUCT_CODE\": \"0007\",\n" +
            "    \"PRODUCT_NAME\": \"信业房产贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A8\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 7,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P04\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信业房产贷\",\n" +
            "    \"CLASS_TYPE\": \"P04\",\n" +
            "    \"PRODUCT_CODE\": \"0009\",\n" +
            "    \"PRODUCT_NAME\": \"信业房产贷27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A10\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 8,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P04\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信优贷\",\n" +
            "    \"CLASS_TYPE\": \"P01\",\n" +
            "    \"PRODUCT_CODE\": \"0033\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷17_A11\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 9,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P01\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信优贷\",\n" +
            "    \"CLASS_TYPE\": \"P01\",\n" +
            "    \"PRODUCT_CODE\": \"0045\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷17_A16\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A16\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 14,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P01\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信优贷\",\n" +
            "    \"CLASS_TYPE\": \"P01\",\n" +
            "    \"PRODUCT_CODE\": \"0000\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 0,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P01\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信优贷\",\n" +
            "    \"CLASS_TYPE\": \"P01\",\n" +
            "    \"PRODUCT_CODE\": \"0008\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 1,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P01\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪佳人贷\",\n" +
            "    \"CLASS_TYPE\": \"P19\",\n" +
            "    \"PRODUCT_CODE\": \"0036\",\n" +
            "    \"PRODUCT_NAME\": \"信薪佳人贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 11,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P19\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪房产贷\",\n" +
            "    \"CLASS_TYPE\": \"P02\",\n" +
            "    \"PRODUCT_CODE\": \"0002\",\n" +
            "    \"PRODUCT_NAME\": \"信薪房产贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A3\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 5,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P02\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪房产贷\",\n" +
            "    \"CLASS_TYPE\": \"P02\",\n" +
            "    \"PRODUCT_CODE\": \"0006\",\n" +
            "    \"PRODUCT_NAME\": \"信薪房产贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A7\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 6,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P02\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪房产贷\",\n" +
            "    \"CLASS_TYPE\": \"P02\",\n" +
            "    \"PRODUCT_CODE\": \"0048\",\n" +
            "    \"PRODUCT_NAME\": \"信薪房产贷27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A19\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 17,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P02\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪按揭贷\",\n" +
            "    \"CLASS_TYPE\": \"P05\",\n" +
            "    \"PRODUCT_CODE\": \"0004\",\n" +
            "    \"PRODUCT_NAME\": \"信薪按揭贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A5\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 2,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P05\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪按揭贷\",\n" +
            "    \"CLASS_TYPE\": \"P05\",\n" +
            "    \"PRODUCT_CODE\": \"0039\",\n" +
            "    \"PRODUCT_NAME\": \"信薪按揭贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A12\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 10,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P05\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪按揭贷\",\n" +
            "    \"CLASS_TYPE\": \"P05\",\n" +
            "    \"PRODUCT_CODE\": \"0065\",\n" +
            "    \"PRODUCT_NAME\": \"信薪按揭贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A20\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 18,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P05\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪贷\",\n" +
            "    \"CLASS_TYPE\": \"P03\",\n" +
            "    \"PRODUCT_CODE\": \"0001\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 3,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P03\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪贷\",\n" +
            "    \"CLASS_TYPE\": \"P03\",\n" +
            "    \"PRODUCT_CODE\": \"0005\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 4,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P03\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪贷\",\n" +
            "    \"CLASS_TYPE\": \"P03\",\n" +
            "    \"PRODUCT_CODE\": \"0042\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 15,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P03\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"车贷\",\n" +
            "    \"CLASS_TYPE\": \"P07\",\n" +
            "    \"PRODUCT_CODE\": \"0015\",\n" +
            "    \"PRODUCT_NAME\": \"车贷_40\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 4.0000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"IF\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 13,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P07\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪贷\",\n" +
            "    \"CLASS_TYPE\": \"P03\",\n" +
            "    \"PRODUCT_CODE\": \"0010\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷29\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A18\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 16,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P03\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪佳人贷\",\n" +
            "    \"CLASS_TYPE\": \"P19\",\n" +
            "    \"PRODUCT_CODE\": \"0037\",\n" +
            "    \"PRODUCT_NAME\": \"信薪佳人贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A21\",\n" +
            "    \"STATUS\": \"INVALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 19,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P19\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"车贷\",\n" +
            "    \"CLASS_TYPE\": \"P07\",\n" +
            "    \"PRODUCT_CODE\": \"0016\",\n" +
            "    \"PRODUCT_NAME\": \"车贷_29.8\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9800,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"IF\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 12,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P07\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"0080\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 20,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"0081\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 21,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"0082\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 22,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网薪期\",\n" +
            "    \"CLASS_TYPE\": \"P30\",\n" +
            "    \"PRODUCT_CODE\": \"0094\",\n" +
            "    \"PRODUCT_NAME\": \"网薪期08\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.8000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 24,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P30\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网薪期\",\n" +
            "    \"CLASS_TYPE\": \"P30\",\n" +
            "    \"PRODUCT_CODE\": \"0091\",\n" +
            "    \"PRODUCT_NAME\": \"网薪期13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 25,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P30\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网薪期\",\n" +
            "    \"CLASS_TYPE\": \"P30\",\n" +
            "    \"PRODUCT_CODE\": \"0092\",\n" +
            "    \"PRODUCT_NAME\": \"网薪期15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 26,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P30\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网薪期\",\n" +
            "    \"CLASS_TYPE\": \"P30\",\n" +
            "    \"PRODUCT_CODE\": \"0093\",\n" +
            "    \"PRODUCT_NAME\": \"网薪期17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 27,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P30\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网信优\",\n" +
            "    \"CLASS_TYPE\": \"P36\",\n" +
            "    \"PRODUCT_CODE\": \"1001\",\n" +
            "    \"PRODUCT_NAME\": \"网信优19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 28,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P36\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网信优\",\n" +
            "    \"CLASS_TYPE\": \"P36\",\n" +
            "    \"PRODUCT_CODE\": \"1002\",\n" +
            "    \"PRODUCT_NAME\": \"网信优21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 29,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P36\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网信薪\",\n" +
            "    \"CLASS_TYPE\": \"P40\",\n" +
            "    \"PRODUCT_CODE\": \"1101\",\n" +
            "    \"PRODUCT_NAME\": \"网信薪23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 30,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P40\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网信薪\",\n" +
            "    \"CLASS_TYPE\": \"P40\",\n" +
            "    \"PRODUCT_CODE\": \"1102\",\n" +
            "    \"PRODUCT_NAME\": \"网信薪25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 31,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P40\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"路信优\",\n" +
            "    \"CLASS_TYPE\": \"P50\",\n" +
            "    \"PRODUCT_CODE\": \"1201\",\n" +
            "    \"PRODUCT_NAME\": \"路信优19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 32,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P50\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"路信优\",\n" +
            "    \"CLASS_TYPE\": \"P50\",\n" +
            "    \"PRODUCT_CODE\": \"1202\",\n" +
            "    \"PRODUCT_NAME\": \"路信优21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 33,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P50\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"路信薪\",\n" +
            "    \"CLASS_TYPE\": \"P52\",\n" +
            "    \"PRODUCT_CODE\": \"1203\",\n" +
            "    \"PRODUCT_NAME\": \"路信薪23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 34,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P52\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"路信薪\",\n" +
            "    \"CLASS_TYPE\": \"P52\",\n" +
            "    \"PRODUCT_CODE\": \"1204\",\n" +
            "    \"PRODUCT_NAME\": \"路信薪25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 35,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P52\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"路信薪\",\n" +
            "    \"CLASS_TYPE\": \"P52\",\n" +
            "    \"PRODUCT_CODE\": \"1205\",\n" +
            "    \"PRODUCT_NAME\": \"路信薪27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 36,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P52\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"优来贷\",\n" +
            "    \"CLASS_TYPE\": \"P60\",\n" +
            "    \"PRODUCT_CODE\": \"1301\",\n" +
            "    \"PRODUCT_NAME\": \"优来贷17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 37,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P60\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"优来贷\",\n" +
            "    \"CLASS_TYPE\": \"P60\",\n" +
            "    \"PRODUCT_CODE\": \"1302\",\n" +
            "    \"PRODUCT_NAME\": \"优来贷19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 38,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P60\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"优来贷\",\n" +
            "    \"CLASS_TYPE\": \"P60\",\n" +
            "    \"PRODUCT_CODE\": \"1303\",\n" +
            "    \"PRODUCT_NAME\": \"优来贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 39,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P60\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"优来贷\",\n" +
            "    \"CLASS_TYPE\": \"P60\",\n" +
            "    \"PRODUCT_CODE\": \"1304\",\n" +
            "    \"PRODUCT_NAME\": \"优来贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 40,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P60\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"优来贷\",\n" +
            "    \"CLASS_TYPE\": \"P60\",\n" +
            "    \"PRODUCT_CODE\": \"1305\",\n" +
            "    \"PRODUCT_NAME\": \"优来贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 41,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P60\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信优贷\",\n" +
            "    \"CLASS_TYPE\": \"P01\",\n" +
            "    \"PRODUCT_CODE\": \"0011\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 42,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P01\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"0083\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 43,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"0084\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 44,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网薪期\",\n" +
            "    \"CLASS_TYPE\": \"P30\",\n" +
            "    \"PRODUCT_CODE\": \"0095\",\n" +
            "    \"PRODUCT_NAME\": \"网薪期07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 45,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"网薪期\",\n" +
            "    \"CLASS_TYPE\": \"P30\",\n" +
            "    \"PRODUCT_CODE\": \"0096\",\n" +
            "    \"PRODUCT_NAME\": \"网薪期10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"W10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 46,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪佳人贷\",\n" +
            "    \"CLASS_TYPE\": \"P19\",\n" +
            "    \"PRODUCT_CODE\": \"0034\",\n" +
            "    \"PRODUCT_NAME\": \"信薪佳人贷13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 48,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P19\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪佳人贷\",\n" +
            "    \"CLASS_TYPE\": \"P19\",\n" +
            "    \"PRODUCT_CODE\": \"0035\",\n" +
            "    \"PRODUCT_NAME\": \"信薪佳人贷15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 49,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P19\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"高学历客群测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P73\",\n" +
            "    \"PRODUCT_CODE\": \"1601\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷15_A29\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 74,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P73\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"高学历客群测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P73\",\n" +
            "    \"PRODUCT_CODE\": \"1602\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷17_A30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 75,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P73\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7201\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 168,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7202\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 169,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7203\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 170,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7204\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 171,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7205\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 172,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7206\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 173,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7207\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 174,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7208\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 175,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7209\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 176,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7210\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 177,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7211\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 178,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7212\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 179,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7213\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 180,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7214\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 181,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7215\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 182,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7216\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 183,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7217\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 184,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7218\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 185,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7219\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 186,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7220\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 187,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7221\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F33\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ21\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 188,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7222\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F35\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 189,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7223\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F37\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 190,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7224\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F40\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 191,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7225\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F33（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 192,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7226\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F35（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ26\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 193,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7227\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F37（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ27\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 194,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷F\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7228\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F40（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ28\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 195,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7608\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 296,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7609\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 297,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7610\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 298,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7611\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 299,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7612\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 300,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7613\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 301,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7614\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 302,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7615\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 303,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7616\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 304,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7617\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 305,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7618\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 306,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7619\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 307,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7620\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 308,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7621\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F33\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF21\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 309,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7622\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F35\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 310,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7623\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F37\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 311,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7624\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F40\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 312,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7625\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F33（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 313,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7626\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F35（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF26\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 314,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7627\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F37（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF27\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 315,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7628\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F40（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF28\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 316,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7501\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 261,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7502\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 262,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7503\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 263,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7504\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 264,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7505\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 265,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7506\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 266,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7507\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 267,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7508\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 268,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7509\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 269,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7510\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 270,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7511\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 271,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7512\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 272,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7513\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 273,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7514\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 274,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7515\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 275,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7516\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 276,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7517\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 277,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7518\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 278,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7519\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 279,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7520\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 280,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7521\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C33\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC21\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 281,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7522\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C35\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 282,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7523\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C37\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 283,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7524\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C40\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 284,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7525\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C33（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 285,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7526\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C35（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC26\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 286,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7527\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C37（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC27\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 287,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7528\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C40（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC28\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 288,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7701\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 233,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7702\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 234,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7703\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 235,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"互联网族群测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P71\",\n" +
            "    \"PRODUCT_CODE\": \"1401\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷17_A27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A27\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 61,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P71\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪贷\",\n" +
            "    \"CLASS_TYPE\": \"P03\",\n" +
            "    \"PRODUCT_CODE\": \"1402\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 62,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P03\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5001\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 64,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5002\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 65,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5003\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 66,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5004\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 67,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5005\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 68,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5006\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 69,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5007\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 70,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5008\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 71,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪贷\",\n" +
            "    \"CLASS_TYPE\": \"P03\",\n" +
            "    \"PRODUCT_CODE\": \"0046\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A28\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.9000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 72,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P03\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7704\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 236,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7705\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 237,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7706\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 238,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7707\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 239,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7708\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 240,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7709\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 241,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7710\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 242,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7711\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 243,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7712\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 244,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7713\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 245,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7714\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 246,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7715\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 247,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7716\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 248,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7717\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 249,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7718\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 250,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7719\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 251,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7720\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 252,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7721\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C33\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX21\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 253,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7722\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C35\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 254,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7723\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C37\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 255,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7724\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C40\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 256,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7725\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C33（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 257,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7726\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C35（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX26\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 258,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7727\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C37（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX27\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 259,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7728\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C40（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX28\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 260,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"1801\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷07_S22\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 317,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"1802\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷10_S23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 318,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"1803\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷13_S24\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 319,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"薪期贷\",\n" +
            "    \"CLASS_TYPE\": \"P20\",\n" +
            "    \"PRODUCT_CODE\": \"1804\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷15_S25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 320,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P20\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4029\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 323,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4030\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 324,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5029\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 325,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5030\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 326,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6029\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 327,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6030\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 328,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7029\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 329,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7030\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 330,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7129\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 331,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7130\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 332,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7229\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 333,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百营贷\",\n" +
            "    \"CLASS_TYPE\": \"P77\",\n" +
            "    \"PRODUCT_CODE\": \"7230\",\n" +
            "    \"PRODUCT_NAME\": \"百营贷F10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"YJ30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 334,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P77\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7329\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 335,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7330\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 336,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7429\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 337,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7430\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 338,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7529\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 339,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P83\",\n" +
            "    \"PRODUCT_CODE\": \"7530\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷C10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JC30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 340,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P83\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7629\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 341,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7630\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 342,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7729\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C07（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX29\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 343,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷\",\n" +
            "    \"CLASS_TYPE\": \"P82\",\n" +
            "    \"PRODUCT_CODE\": \"7730\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷C10（Q）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZX30\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 344,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P82\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪佳人贷\",\n" +
            "    \"CLASS_TYPE\": \"P19\",\n" +
            "    \"PRODUCT_CODE\": \"0043\",\n" +
            "    \"PRODUCT_NAME\": \"信薪佳人贷17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 53,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P19\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4008\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 73,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7101\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 120,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7102\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 121,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7103\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 122,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7104\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 123,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7105\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 124,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7106\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 125,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7107\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 126,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7108\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 127,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7109\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 128,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7110\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 129,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7111\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 130,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7112\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 131,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7113\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 132,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7114\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 133,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7115\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 134,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7116\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 135,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7117\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 136,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7118\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 137,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7119\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 138,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7120\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 139,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7121\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F33\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ21\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 160,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7122\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F35\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 161,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7123\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F37\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 162,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7124\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F40\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 163,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7125\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F33（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 164,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7126\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F35（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ26\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 165,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7127\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F37（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ27\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 166,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷F\",\n" +
            "    \"CLASS_TYPE\": \"P75\",\n" +
            "    \"PRODUCT_CODE\": \"7128\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷F40（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TJ28\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 167,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P75\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7001\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 140,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7002\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 141,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7003\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 142,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7004\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 143,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7005\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 144,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7006\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 145,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7007\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 146,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7008\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 147,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7009\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 148,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7010\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 149,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7011\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 150,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7012\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 151,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7013\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 152,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7014\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 153,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7015\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 154,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7016\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 155,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7017\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 156,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7018\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 157,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7019\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 158,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钞贷C\",\n" +
            "    \"CLASS_TYPE\": \"P76\",\n" +
            "    \"PRODUCT_CODE\": \"7020\",\n" +
            "    \"PRODUCT_NAME\": \"百钞贷C30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"TX20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 159,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P76\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"自雇人士测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P80\",\n" +
            "    \"PRODUCT_CODE\": \"1722\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷25_A32\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A32\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 227,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P80\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"自雇人士测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P80\",\n" +
            "    \"PRODUCT_CODE\": \"1721\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷23_A31\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A31\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 229,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P80\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7401\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 196,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7402\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 197,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7403\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 198,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7404\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 199,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7405\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 200,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7406\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 201,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7407\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 202,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7408\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 203,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7409\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷13(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 204,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7410\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷15(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 205,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7411\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷17(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 206,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7412\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷19(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 207,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7413\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷21(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 208,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7414\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷23(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 209,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7415\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 204,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7416\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 205,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7417\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 206,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7418\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷25(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 207,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7419\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷27(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 208,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7420\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷30(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 209,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7421\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷33\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C21\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 210,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7422\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷35\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 211,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7423\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷37\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 212,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7424\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷40\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 213,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7425\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷33(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 214,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7426\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷35(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C26\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 215,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7427\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷37(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C27\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 216,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百财贷\",\n" +
            "    \"CLASS_TYPE\": \"P79\",\n" +
            "    \"PRODUCT_CODE\": \"7428\",\n" +
            "    \"PRODUCT_NAME\": \"百财贷40(F)\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"C28\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 217,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P79\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"自雇人士测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P80\",\n" +
            "    \"PRODUCT_CODE\": \"1723\",\n" +
            "    \"PRODUCT_NAME\": \"信薪贷21_A35\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A35\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 232,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P80\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"公务员客群测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P81\",\n" +
            "    \"PRODUCT_CODE\": \"1703\",\n" +
            "    \"PRODUCT_NAME\": \"薪期贷13_S21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S21\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 230,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P81\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"公务员客群测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P81\",\n" +
            "    \"PRODUCT_CODE\": \"1704\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷17_A36\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A36\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 231,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P81\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪佳人贷\",\n" +
            "    \"CLASS_TYPE\": \"P19\",\n" +
            "    \"PRODUCT_CODE\": \"0038\",\n" +
            "    \"PRODUCT_NAME\": \"信薪佳人贷07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 50,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P19\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪佳人贷\",\n" +
            "    \"CLASS_TYPE\": \"P19\",\n" +
            "    \"PRODUCT_CODE\": \"0040\",\n" +
            "    \"PRODUCT_NAME\": \"信薪佳人贷10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"S19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 0.000000,\n" +
            "    \"ORDERVALUE\": 51,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P19\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"信薪佳人贷\",\n" +
            "    \"CLASS_TYPE\": \"P19\",\n" +
            "    \"PRODUCT_CODE\": \"0041\",\n" +
            "    \"PRODUCT_NAME\": \"信薪佳人贷19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 52,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P19\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4001\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 54,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4002\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 55,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4003\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 56,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4004\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 57,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4005\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 58,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4006\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 59,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4007\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 60,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"按揭贷族群测试专案\",\n" +
            "    \"CLASS_TYPE\": \"P72\",\n" +
            "    \"PRODUCT_CODE\": \"1501\",\n" +
            "    \"PRODUCT_NAME\": \"信优贷15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"A26\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 63,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P72\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4009\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 108,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4010\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 109,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4011\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 110,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4012\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 111,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4013\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 112,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4014\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 113,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4015\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 114,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4016\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 115,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4017\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 116,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4018\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 117,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4019\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 118,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百信贷\",\n" +
            "    \"CLASS_TYPE\": \"P61\",\n" +
            "    \"PRODUCT_CODE\": \"4020\",\n" +
            "    \"PRODUCT_NAME\": \"百信贷30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"X20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 119,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P61\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5009\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 96,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5010\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 97,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5011\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 98,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5012\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 99,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5013\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 100,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5014\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 101,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5015\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 102,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5016\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 103,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5017\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 104,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5018\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 105,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5019\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 106,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百金贷\",\n" +
            "    \"CLASS_TYPE\": \"P62\",\n" +
            "    \"PRODUCT_CODE\": \"5020\",\n" +
            "    \"PRODUCT_NAME\": \"百金贷30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"J20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 107,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P62\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6001\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 76,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6002\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 77,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6003\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 78,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6004\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 79,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6005\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 80,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6006\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 81,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6007\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 82,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6008\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 83,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6009\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 84,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6010\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 85,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6011\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 86,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6012\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 87,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6013\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 88,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6014\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 89,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6015\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 90,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6016\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 91,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6017\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 92,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6018\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 93,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6019\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 94,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百牛贷\",\n" +
            "    \"CLASS_TYPE\": \"P74\",\n" +
            "    \"PRODUCT_CODE\": \"6020\",\n" +
            "    \"PRODUCT_NAME\": \"百牛贷30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"N20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 95,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P74\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7301\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 196,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7302\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 197,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7303\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 198,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7304\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 199,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7305\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 200,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7306\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 201,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7307\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 202,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7308\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F23\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ8\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 203,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7309\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F13（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ9\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 204,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7310\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F15（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ10\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 205,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7311\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F17（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ11\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 206,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7312\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F19（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ12\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 207,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7313\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F21（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ13\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 208,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7314\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F23（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ14\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 209,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7315\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F25\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ15\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 210,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7316\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F27\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ16\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 211,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7317\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F30\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ17\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 212,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7318\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F25（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ18\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 213,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7319\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F27（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ19\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 214,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7320\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F30（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ20\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 215,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7321\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F33\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ21\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 216,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7322\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F35\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ22\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 217,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7323\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F37\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ23\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 218,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7324\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F40\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ24\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 219,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7325\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F33（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ25\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.3000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 220,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7326\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F35（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ26\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.5000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 221,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7327\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F37（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ27\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.7000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 222,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"钞市贷F\",\n" +
            "    \"CLASS_TYPE\": \"P78\",\n" +
            "    \"PRODUCT_CODE\": \"7328\",\n" +
            "    \"PRODUCT_NAME\": \"钞市贷F40（F）\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"ZJ28\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 3.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 223,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P78\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7601\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F07\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF1\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 289,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7602\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F10\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF2\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 0.9900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 290,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7603\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F13\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF3\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.2900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 291,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7604\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F15\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF4\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.4900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 292,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7605\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F17\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF5\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.6900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 293,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7606\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F19\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF6\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 1.8900,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 294,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"CLASS_NAME\": \"百钱贷F\",\n" +
            "    \"CLASS_TYPE\": \"P84\",\n" +
            "    \"PRODUCT_CODE\": \"7607\",\n" +
            "    \"PRODUCT_NAME\": \"百钱贷F21\",\n" +
            "    \"OBJECT_CUSTOMERS\": \"JF7\",\n" +
            "    \"STATUS\": \"VALID\",\n" +
            "    \"MONTHLY_COST\": 2.1000,\n" +
            "    \"PAYMENT_CALC_TYPE\": \"ACI\",\n" +
            "    \"SINGLE_SERVICEFEE_RATIO\": 100.000000,\n" +
            "    \"ORDERVALUE\": 295,\n" +
            "    \"CATEGORY\": \"CREDITLOAN\",\n" +
            "    \"CLASS_CODE\": \"P84\"\n" +
            "  }\n" +
            "]";

}
