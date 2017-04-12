package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.Shop;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
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
    int deleteByPrimaryKey(Integer shopid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Shop record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Shop record);

    /**
     * 根据条件查询记录集
     */
    List<Shop> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    Shop selectByPrimaryKey(Integer shopid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") Shop record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") Shop record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Shop record);
}