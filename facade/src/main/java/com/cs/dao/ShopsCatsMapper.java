package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.ShopsCats;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface ShopsCatsMapper {
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
    int deleteByPrimaryKey(Integer catid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(ShopsCats record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(ShopsCats record);

    /**
     * 根据条件查询记录集
     */
    List<ShopsCats> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    ShopsCats selectByPrimaryKey(Integer catid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") ShopsCats record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") ShopsCats record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(ShopsCats record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(ShopsCats record);
}