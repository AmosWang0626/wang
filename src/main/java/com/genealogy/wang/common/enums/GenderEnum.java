package com.genealogy.wang.common.enums;

/**
 * PROJECT: com.wang.genealogy
 * DESCRIPTION: note
 *
 * @author daoyuan
 * @date 2018/11/1 11:11
 */
public enum GenderEnum {
    /**
     * 性别
     */
    MEN("男"),
    WOMEN("女"),
    ;

    private final String desc;

    GenderEnum(String desc) {
        this.desc = desc;
    }

    public String getKey() {
        return this.name();
    }

    public String getDesc() {
        return desc;
    }
}
