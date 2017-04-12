package com.cs.dao;

import com.cs.pojo.Brand;
import com.cs.pojo.Criteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface BrandMapper {
    /**
     * 根据条件查询记录总数
     */
    int countByParams(Criteria example);

    /**
     * 根据条件删除记录
     */
    int deleteByParams(Criteria example);

    /**
     * 根据主键删除记录
     */
    int deleteByPrimaryKey(Integer brandid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Brand record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Brand record);

    /**
     * 根据条件查询记录集
     */
    List<Brand> selectByParamsWithBLOBs(Criteria example);

    /**
     * 根据条件查询记录集
     */
    List<Brand> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    Brand selectByPrimaryKey(Integer brandid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") Brand record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParamsWithBLOBs(@Param("record") Brand record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") Brand record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Brand record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(Brand record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Brand record);
}