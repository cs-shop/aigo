package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.OrderComplain;
import com.cs.pojo.OrderComplain;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface OrderComplainMapper {
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
    int deleteByPrimaryKey(Integer complainid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(OrderComplain record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(OrderComplain record);

    /**
     * 根据条件查询记录集
     */
    List<OrderComplain> selectByParamsWithBLOBs(Criteria example);

    /**
     * 根据条件查询记录集
     */
    List<OrderComplain> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    OrderComplain selectByPrimaryKey(Integer complainid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") OrderComplain record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParamsWithBLOBs(@Param("record") OrderComplain record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") OrderComplain record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(OrderComplain record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(OrderComplain record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(OrderComplain record);
}