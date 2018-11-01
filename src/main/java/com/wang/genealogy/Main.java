package com.wang.genealogy;

import com.wang.genealogy.entity.GenealogyEntity;
import com.wang.genealogy.enums.GenderEnum;
import com.wang.genealogy.enums.GradeEnum;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author daoyuan
 * @date 2018/11/1 11:09
 */
public class Main {

    public static void main(String[] args) {
        GenealogyEntity entity = new GenealogyEntity("Wang 1", "1996", GenderEnum.MEN, GradeEnum.ONE);
        System.out.println(entity);
    }
}
