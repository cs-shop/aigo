package com.cs.dao;

import com.cs.pojo.Cart;
import com.cs.pojo.Criteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface CartMapper {
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
    int deleteByPrimaryKey(Integer cartid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(Cart record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(Cart record);

    /**
     * 根据条件查询记录集
     */
    List<Cart> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    Cart selectByPrimaryKey(Integer cartid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") Cart record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") Cart record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(Cart record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(Cart record);
}