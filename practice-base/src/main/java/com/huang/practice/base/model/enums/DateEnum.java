package com.huang.practice.base.model.enums;

public enum DateEnum {
    YEAR(1), MONTH(2), DAY_OF_MONTH(5), HOUR(10), HOUR_OF_DAY(11), MINUTE(12), SECOND(13);

    private int time;

    DateEnum(int time) {
        this.time = time;
    }

    public int getTime() {
        return time;
    }
}
