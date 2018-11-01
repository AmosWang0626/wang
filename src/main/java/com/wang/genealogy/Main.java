package com.wang.genealogy;

import com.wang.genealogy.entity.GenealogyEntity;
import com.wang.genealogy.enums.GenderEnum;
import com.wang.genealogy.enums.PersonMarkEnum;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author daoyuan
 * @date 2018/11/1 11:09
 */
public class Main {

    public static void main(String[] args) {

        new GenealogyEntity("0001", null, "王其培", "", "", GenderEnum.MEN, PersonMarkEnum.ROOT);
        new GenealogyEntity("0002", "0001", "王成功", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_ONE);
        new GenealogyEntity("0003", "0001", "王西功", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_TWO);
        new GenealogyEntity("0004", "0001", "王占功", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_THREE);

        new GenealogyEntity("0005", "0002", "王大会", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_ONE);
        new GenealogyEntity("0006", "0002", "王小会", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_TWO);
        new GenealogyEntity("0007", "0003", "王俊立", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_ONE);
        new GenealogyEntity("0008", "0004", "王正坤", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_ONE);
        new GenealogyEntity("0009", "0003", "王正普", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_TWO);
        new GenealogyEntity("0010", "0002", "王正虎", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_THREE);
        new GenealogyEntity("0011", "0003", "王正武", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_THREE);
        new GenealogyEntity("0012", "0002", "王正谦", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_FOUR);
        new GenealogyEntity("0013", "0004", "王正全", "", "", GenderEnum.MEN, PersonMarkEnum.CHILDREN_TWO);

    }
}
