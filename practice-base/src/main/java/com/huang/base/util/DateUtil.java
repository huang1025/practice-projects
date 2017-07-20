package com.huang.base.util;

import com.huang.base.model.enums.DateEnum;
import com.huang.base.model.enums.DatePattrnEnum;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date changeDate(Date date, DateEnum dateEnum, int num) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(dateEnum.getTime(), num);
        return calendar.getTime();
    }

    public static String date2String(Date date, DatePattrnEnum datePattrnEnum) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(datePattrnEnum.getPattern());
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        String s = "    private String ID;\n" +
                "\n" +
                "    private String APPLY_CODE;\n" +
                "\n" +
                "    private String STATUS;\n" +
                "\n" +
                "    private Date CREATED_TIME;\n" +
                "\n" +
                "    private String RISK_LEVEL;\n" +
                "\n" +
                "    private String SOURCE_CHANNEL;\n" +
                "\n" +
                "    private String LOCATION;\n" +
                "\n" +
                "    private String CALL_TYPE;\n" +
                "\n" +
                "    private String IF_ID_PHOTO;\n" +
                "\n" +
                "    private String IF_ID_VALID;\n" +
                "\n" +
                "    private String IF_CC_VALID;\n" +
                "\n" +
                "    private String ID_AVA_DATE;\n" +
                "\n" +
                "    private String GSW_STATUS;\n" +
                "\n" +
                "    private String IF_FRGD;\n" +
                "\n" +
                "    private String GSW_CAMP_CREATE_TIME;\n" +
                "\n" +
                "    private String GSW_CAMP_ADDRESS;\n" +
                "\n" +
                "    private String CC_CODE;\n" +
                "\n" +
                "    private String PYFR_STATUS;\n" +
                "\n" +
                "    private String PYFR_CAMP_STATUS;\n" +
                "\n" +
                "    private String APPLY_TIME;\n" +
                "\n" +
                "    private String GPS_CITY;\n" +
                "\n" +
                "    private String SOURCE_SUB_CHANNEL;\n" +
                "\n" +
                "    private String RELATION_FUND_COM;\n" +
                "\n" +
                "    private String RF_STATUS;\n" +
                "\n" +
                "    private String SHZX_STATUS;\n" +
                "\n" +
                "    private String IF_FD;\n" +
                "\n" +
                "    private String GSW_CAMP_CITY;\n" +
                "\n" +
                "    private String IF_BRANCH;\n" +
                "\n" +
                "    private String IF_XD;\n" +
                "\n" +
                "    private Integer ZM_SCORE;，";
        String replace = StringUtils.replace(s, "\n\n", "");
        String[] split = replace.split(";");
        for (String each : split) {
            String[] strings = each.trim().split(" ");
            System.out.println("<columnOverride column=\"" + strings[2] + "\" javaType=\"" + strings[1] + "\"/>");
        }
    }
}
