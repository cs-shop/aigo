package com.hptsic.cloud.res.dao;

import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResVe;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface ResVeMapper {
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
    int deleteByPrimaryKey(String resVeSid);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(ResVe record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(ResVe record);

    /**
     * 根据条件查询记录集
     */
    List<ResVe> selectByParams(Criteria example);

    /**
     * 根据主键查询记录
     */
    ResVe selectByPrimaryKey(String resVeSid);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") ResVe record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") ResVe record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据主键更新属性不为空的记录
     */
    int updateByPrimaryKeySelective(ResVe record);

    /**
     * 根据主键更新记录
     */
    int updateByPrimaryKey(ResVe record);
}