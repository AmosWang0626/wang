package com.genealogy.wang.common.enums;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
public enum NumberEnum {
    /**
     * 数字枚举
     */
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12),
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    ;

    private final Integer desc;

    NumberEnum(Integer desc) {
        this.desc = desc;
    }

    public String getKey() {
        return this.name();
    }

    public Integer getDesc() {
        return desc;
    }
}
