package com.genealogy.wang.web;

import lombok.Data;

/**
 * PROJECT: wang
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/12/16
 */
@Data
public class FamilyInfoRequest {

    /**
     * 页数
     */
    private Integer page;
    /**
     * 每页显示数量
     */
    private Integer size;

}
