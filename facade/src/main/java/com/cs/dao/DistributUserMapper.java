package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.DistributUser;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface DistributUserMapper {
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
    int deleteByPrimaryKey(Integer distributid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(DistributUser record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(DistributUser record);

    /**
     * 根据条件查询记录集
     */
    List<DistributUser> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    DistributUser selectByPrimaryKey(Integer distributid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") DistributUser record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") DistributUser record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(DistributUser record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(DistributUser record);
}