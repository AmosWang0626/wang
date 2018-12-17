package com.genealogy.wang.dao.mapper;

import com.genealogy.wang.common.enums.GenderEnum;
import com.genealogy.wang.dao.entity.FamilyEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * PROJECT: genealogy
 * DESCRIPTION: note
 *
 * @author Daoyuan
 * @date 2018/11/1
 */
public interface FamilyMapper extends CrudRepository<FamilyEntity, Long> {

    /**
     * 根据辈分查询所有家人
     *
     * @param seniority 辈分
     * @param gender    性别
     * @return 所有家人
     */
    List<FamilyEntity> findBySeniorityAndGender(Integer seniority, GenderEnum gender);

    /**
     * 根据名字正则查询所有家人
     *
     * @param name 名字
     * @return 所有家人
     */
    @Query(value = "SELECT * FROM #{#entityName} WHERE `name` REGEXP ?1", nativeQuery = true)
    List<FamilyEntity> findByNameRegexp(String name);

    /**
     * 根据关联ID查询所有家人
     *
     * @param id 关联id
     * @return 所有家人
     */
    List<FamilyEntity> findAllByRelationId(Long id);

    /**
     * 分页
     *
     * @param pageable pageable
     * @return List<FamilyEntity>
     */
    @Query(value = "SELECT * FROM #{#entityName} order by SENIORITY, RANKING",
            countQuery = "SELECT count(*) FROM #{#entityName}",
            nativeQuery = true)
    Page<FamilyEntity> findAll(Pageable pageable);

    /**
     * 分页 by 辈分
     *
     * @param seniority 辈分
     * @param pageable  pageable
     * @return List<FamilyEntity>
     */
    @Query(value = "SELECT * FROM #{#entityName} WHERE SENIORITY = ?1 order by RANKING",
            countQuery = "SELECT count(*) FROM #{#entityName} WHERE SENIORITY = ?1",
            nativeQuery = true)
    Page<FamilyEntity> findBySeniority(Integer seniority, Pageable pageable);
}
