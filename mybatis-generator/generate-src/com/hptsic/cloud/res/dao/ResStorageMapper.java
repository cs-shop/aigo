package com.hptsic.cloud.res.dao;

import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResStorage;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface ResStorageMapper {
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
    int deleteByPrimaryKey(String resStorageSid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(ResStorage record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(ResStorage record);

    /**
     * 根据条件查询记录集
     */
    List<ResStorage> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    ResStorage selectByPrimaryKey(String resStorageSid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") ResStorage record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") ResStorage record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(ResStorage record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(ResStorage record);
}