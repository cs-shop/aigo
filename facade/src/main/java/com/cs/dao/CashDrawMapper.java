package com.cs.dao;

import com.cs.pojo.CashDraw;
import com.cs.pojo.Criteria;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface CashDrawMapper {
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
    int deleteByPrimaryKey(Integer cashid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(CashDraw record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(CashDraw record);

    /**
     * 根据条件查询记录集
     */
    List<CashDraw> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    CashDraw selectByPrimaryKey(Integer cashid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") CashDraw record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") CashDraw record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(CashDraw record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(CashDraw record);
}