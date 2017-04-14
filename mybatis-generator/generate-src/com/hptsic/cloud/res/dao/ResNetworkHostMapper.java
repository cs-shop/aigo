package com.hptsic.cloud.res.dao;

import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResNetworkHostKey;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface ResNetworkHostMapper {
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
    int deleteByPrimaryKey(ResNetworkHostKey key);

    /**
     * 保存记录,不管记录里面的属性是否为空
     */
    int insert(ResNetworkHostKey record);

    /**
     * 保存属性不为空的记录
     */
    int insertSelective(ResNetworkHostKey record);

    /**
     * 根据条件查询记录集
     */
    List<ResNetworkHostKey> selectByParams(Criteria example);

    /**
     * 根据条件更新属性不为空的记录
     */
    int updateByParamsSelective(@Param("record") ResNetworkHostKey record, @Param("condition") Map<String, Object> condition);

    /**
     * 根据条件更新记录
     */
    int updateByParams(@Param("record") ResNetworkHostKey record, @Param("condition") Map<String, Object> condition);
}