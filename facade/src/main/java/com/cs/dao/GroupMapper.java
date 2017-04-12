package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.Group;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface GroupMapper {
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
    int deleteByPrimaryKey(Integer groupid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Group record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Group record);

    /**
     * 根据条件查询记录集
     */
    List<Group> selectByParamsWithBLOBs(Criteria example);

    /**
     * 根据条件查询记录集
     */
    List<Group> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    Group selectByPrimaryKey(Integer groupid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") Group record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParamsWithBLOBs(@Param("record") Group record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") Group record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Group record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(Group record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Group record);
}