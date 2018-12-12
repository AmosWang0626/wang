package com.genealogy.wang.common.enums;

/**
 * @author daoyuan
 */
public enum PersonMarkEnum {

    /**
     * 标识
     */
    ROOT("根"),
    SPOUSE("配偶"),
    CHILDREN_ONE("大孩子"),
    CHILDREN_TWO("二孩子"),
    CHILDREN_THREE("三孩子"),
    CHILDREN_FOUR("四孩子"),
    CHILDREN_FIVE("五孩子"),
    CHILDREN_SIX("六孩子"),
    ;

    private final String desc;

    PersonMarkEnum(String desc) {
        this.desc = desc;
    }

    public String getKey() {
        return this.name();
    }

    public String getDesc() {
        return desc;
    }
}
