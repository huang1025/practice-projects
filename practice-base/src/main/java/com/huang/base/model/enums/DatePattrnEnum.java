package com.huang.base.model.enums;

public enum DatePattrnEnum {
    yyyyMMddHHmmss("yyyy-MM-dd HH-mm-ss"),yyyyMM("yyyyMM");

    private String pattern;

    DatePattrnEnum(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
