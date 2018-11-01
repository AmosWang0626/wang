package com.wang.genealogy.enums;

/**
 * PROJECT: genealogy
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

    public String getDesc() {
        return desc;
    }
}
