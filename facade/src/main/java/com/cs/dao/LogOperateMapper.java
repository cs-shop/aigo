package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.LogOperate;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface LogOperateMapper {
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
    int deleteByPrimaryKey(Integer operateid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(LogOperate record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(LogOperate record);

    /**
     * 根据条件查询记录集
     */
    List<LogOperate> selectByParamsWithBLOBs(Criteria example);

    /**
     * 根据条件查询记录集
     */
    List<LogOperate> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    LogOperate selectByPrimaryKey(Integer operateid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") LogOperate record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParamsWithBLOBs(@Param("record") LogOperate record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") LogOperate record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(LogOperate record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(LogOperate record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(LogOperate record);
}