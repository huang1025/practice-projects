package com.huang;

import com.huang.base.util.StringUtil;

/**
 * Created by huang_jiangling on 2017/8/11.
 */
public class ColumnToPropertyUtil {

    public static void main(String[] args) {

        String[] keys = {};
        System.out.println(column2Property(keys));
    }

    private static String column2Property(String[] keys) {

        //<columnOverride column="create_time" property="createTime" />

        String prefix = "<columnOverride column=\"";
        String milldle = "\" property=\"";
        String postfix = "\" />\n";
        StringBuilder sb = new StringBuilder(1000);

        for (String eachKey : keys) {
            String temp = eachKey;
            String column = temp.toUpperCase();
            String property = StringUtil.turnUnderLine(eachKey);
            sb.append(prefix).append(column).append(milldle).append(property).append(postfix);
        }
        return sb.toString();
    }
}
