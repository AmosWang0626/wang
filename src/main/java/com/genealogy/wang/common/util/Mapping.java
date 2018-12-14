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
public class Mapping<K, V> implements Serializable {

    private static final long serialVersionUID = 1331598500191947810L;

    private K key;
    private V value;

    public Mapping(K key, V value) {
        this.key = key;
        this.value = value;
    }
}
