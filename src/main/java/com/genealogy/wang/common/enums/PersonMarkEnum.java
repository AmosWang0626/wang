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
    SON("儿子"),
    DAUGHTER("女儿"),
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
