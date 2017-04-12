package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsRelated;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface GoodsRelatedMapper {
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
    int deleteByPrimaryKey(Integer id);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(GoodsRelated record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(GoodsRelated record);

    /**
     * 根据条件查询记录集
     */
    List<GoodsRelated> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    GoodsRelated selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") GoodsRelated record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") GoodsRelated record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(GoodsRelated record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(GoodsRelated record);
}