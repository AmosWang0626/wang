package com.genealogy.wang.web.response;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.common.enums.RelationEnum;
import lombok.Data;

import java.util.Date;

/**
 * PROJECT: wang
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/12/16
 */
@Data
public class FamilyInfoVO {

    /**
     * id
     */
    private Long id;
    /**
     * 名字
     */
    private String name;
    /**
     * 关联ID
     */
    private Long relationId;
    /**
     * 关联人
     */
    private String relationName;
    /**
     * 关联关系key
     */
    private RelationEnum relation;
    /**
     * 关联关系描述
     */
    private String relationDesc;
    /**
     * 辈分
     */
    private Integer seniority;
    /**
     * 排行
     */
    private Integer ranking;
    /**
     * 性别
     */
    private GenderEnum gender;
    /**
     * 性别
     */
    private String genderDesc;
    /**
     * 出生年月日
     */
    private Date born;
    /**
     * 寿终年月日
     */
    private String elapse;

}
