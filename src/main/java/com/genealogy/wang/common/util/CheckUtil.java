package com.genealogy.wang.common.util;

/**
 * PROJECT: wang
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/12/12
 */
public class CheckUtil {

    /**
     * 检查字符串是不是为 null 字符串
     *
     * @param str 字符串
     * @return null true;
     */
    public static boolean blank(String str) {
        return str == null || str.trim().length() == 0;
    }

}
