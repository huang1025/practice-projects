package com.huang.base.util;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by huang_jiangling on 2017/8/11.
 */
public class StringUtil {

    private StringUtil() {
    }

    public static String turnUnderLine(String s) {
        if (StringUtils.isBlank(s)) {
            return s;
        }

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder(chars.length);
        boolean flag = false;

        for (int i = 0; i < chars.length; i++) {
            char each = chars[i];
            if (each == '_') {
                flag = true;
                continue;
            }

            if (flag) {
                sb.append(Character.toUpperCase(each));
                flag = false;
            } else {
                sb.append(each);
            }
        }

        return sb.toString();
    }

    public static String toJson(String[] keyArray, String[] commentArray, boolean turnUnderLine) {
        JSONObject jsonObject = new JSONObject();

        if (keyArray == null) {
            return jsonObject.toJSONString();
        }

        for (int i = 0; i < keyArray.length; i++) {
            String each = keyArray[i];
            String key = turnUnderLine ? turnUnderLine(each) : each;
            String value = (commentArray == null) || (i > commentArray.length - 1) ? "" : commentArray[i];
            jsonObject.put(key, value);
        }

        return jsonObject.toJSONString();
    }

    public static String toJson(String[] keyArray, boolean turnUnderLine) {
        return toJson(keyArray, null, turnUnderLine);
    }

    public static String toFields(String[] keyArray, String[] commentArray, String[] fieldType, StringToType stringToType, boolean turnUnderLine) {
        if (keyArray == null) {
            return null;
        }

        String privateString = "private";
        String space = " ";
        String enter = "\n";
        String fenhao = ";";
        String comment = "//";
        Set<String> fieldSet = new HashSet<>(keyArray.length);

        StringBuilder sb = new StringBuilder(1000);
        for (int i = 0; i < keyArray.length; i++) {
            String each = keyArray[i];
            String key = turnUnderLine ? turnUnderLine(each) : each;
            String value = (commentArray == null) || (i > commentArray.length - 1) ? "" : commentArray[i];
            String type = stringToType.getType(fieldType[i]).getSimpleName();
            String fileComment = comment + value + fenhao;

            if (!fieldSet.contains(each)) {
                sb.append(privateString).append(space).append(type).append(space).append(key).append(fenhao).append(fileComment).append(enter);
                fieldSet.add(each);
            }
        }

        return sb.toString();
    }


}
