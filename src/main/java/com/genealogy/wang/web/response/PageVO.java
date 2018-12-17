package com.genealogy.wang.web.response;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * PROJECT: wang
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/12/17
 */
@Data
public class PageVO<T> implements Serializable {

    private static final long serialVersionUID = -7654512449887513447L;

    private List<T> content;

    private Long total;

}
