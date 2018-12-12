package com.genealogy.wang.web.request;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.common.enums.PersonMarkEnum;
import com.genealogy.wang.common.enums.SeniorityEnum;
import lombok.Data;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
@Data
public class AddPersonRequest {

    private Long id;
    /**
     * 关联ID
     */
    private Long relationId;
    /**
     * 名字
     */
    private String name;
    /**
     * 性别
     */
    private GenderEnum gender;
    /**
     * 辈分
     */
    private SeniorityEnum seniority;
    /**
     * 出生年月
     */
    private String birth;
    /**
     * 寿终年月
     */
    private String passBirth;
    /**
     * PERSON标识
     */
    private PersonMarkEnum personMark;

}
