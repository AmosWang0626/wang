package com.wang.genealogy.enums;

public enum GradeEnum {

    /**
     * 第几个孩子枚举
     */
    ONE("大孩子"),
    TWO("二孩子"),
    THREE("三孩子"),
    FOUR("四孩子"),
    FIVE("五孩子"),
    SIX("六孩子"),
    SEVEN("七孩子"),
    EIGHT("八孩子"),
    NINE("九孩子"),
    ;

    private final String desc;

    GradeEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }
}
