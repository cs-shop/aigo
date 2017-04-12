package com.cs.dao;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsAttribute;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface GoodsAttributeMapper {
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
    int insert(GoodsAttribute record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(GoodsAttribute record);

    /**
     * 根据条件查询记录集
     */
    List<GoodsAttribute> selectByParamsWithBLOBs(Criteria example);

    /**
     * 根据条件查询记录集
     */
    List<GoodsAttribute> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    GoodsAttribute selectByPrimaryKey(Integer id);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") GoodsAttribute record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParamsWithBLOBs(@Param("record") GoodsAttribute record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") GoodsAttribute record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(GoodsAttribute record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKeyWithBLOBs(GoodsAttribute record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(GoodsAttribute record);
}