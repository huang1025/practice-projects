package com.huang.practice.base.util;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by huang_jiangling on 2017/8/11.
 */
public class StringUtil {

    private StringUtil() {
    }

    /**
     * 将字符串裁剪成字符串集合；
     */
    public static List<String> splitString(String s, String regular) {
        if (StringUtils.isBlank(s)) {
            return new ArrayList<>(0);
        }

        String realRegular = regular;
        if (StringUtils.isBlank(regular)) {
            realRegular = "\n";
        }

        return Arrays.asList(s.split(realRegular));
    }

    /**
     * 转换下划线；
     * 1，将给定字符串中的下划线删除，并将后面的字符转成大写；
     * 2，如果连续出现两个或多个下滑线，那么当成一个下划线处理；
     * 3，如果下划线出现在字符串最后，那么直接删除掉；
     * 4，如果首字母大写，则转成小写；
     */
    public static String turnUnderLine(String s) {
        if (StringUtils.isBlank(s)) {
            return s;
        }

        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder(chars.length);
        boolean flag = false;

        for (char each : chars) {
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

        String returnString = sb.toString();
        return Character.toString(returnString.charAt(0)).toLowerCase() + returnString.substring(1, returnString.length());
    }

    public static String addUnderLine(String field) {

        String interval = "_";
        char[] chars = field.toCharArray();
        StringBuilder sb = new StringBuilder(chars.length * 2);

        for (char each : chars) {
            boolean isUpperCase = Character.isUpperCase(each);
            if (isUpperCase) {
                sb.append(interval).append(Character.toLowerCase(each));
            } else {
                sb.append(each);
            }
        }
        return sb.toString();
    }
}
