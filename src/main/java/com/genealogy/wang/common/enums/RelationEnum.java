package com.genealogy.wang.common.enums;

/**
 * 所有关系
 *
 * @author daoyuan
 */
public enum RelationEnum {

    /**
     * 标识
     */
    ROOT("根"),
    SPOUSE("配偶"),
    SON("儿子"),
    DAUGHTER("女儿"),
    ;

    private final String desc;

    RelationEnum(String desc) {
        this.desc = desc;
    }

    public String getKey() {
        return this.name();
    }

    public String getDesc() {
        return desc;
    }
}
