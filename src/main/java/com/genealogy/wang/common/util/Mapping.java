package com.genealogy.wang.common.util;

import lombok.Data;

import java.io.Serializable;

/**
 * PROJECT: wang
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/12/13
 */
@Data
public class Mapping implements Serializable {

    private static final long serialVersionUID = 1331598500191947810L;

    private String key;
    private String value;

    public Mapping(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
