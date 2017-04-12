package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.SysConfigs;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface SysConfigsMapper {
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
    int deleteByPrimaryKey(Integer configid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(SysConfigs record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(SysConfigs record);

    /**
     * 根据条件查询记录集
     */
    List<SysConfigs> selectByParamsWithBLOBs(Criteria example);

    /**
     * 根据条件查询记录集
     */
    List<SysConfigs> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    SysConfigs selectByPrimaryKey(Integer configid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") SysConfigs record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParamsWithBLOBs(@Param("record") SysConfigs record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") SysConfigs record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(SysConfigs record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(SysConfigs record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(SysConfigs record);
}