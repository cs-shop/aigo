package com.cs.dao;

import com.cs.pojo.Attribute;
import com.cs.pojo.Criteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface AttributeMapper {
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
    int deleteByPrimaryKey(Integer attrid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Attribute record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Attribute record);

    /**
     * 根据条件查询记录集
     */
    List<Attribute> selectByParamsWithBLOBs(Criteria example);

    /**
     * 根据条件查询记录集
     */
    List<Attribute> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    Attribute selectByPrimaryKey(Integer attrid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") Attribute record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParamsWithBLOBs(@Param("record") Attribute record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") Attribute record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Attribute record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(Attribute record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Attribute record);
}