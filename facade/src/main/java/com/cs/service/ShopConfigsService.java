package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.ShopConfigs;
import java.util.List;

public interface ShopConfigsService {
    int countByParams(Criteria example);

    ShopConfigs selectByPrimaryKey(Integer configid);

    List<ShopConfigs> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer configid);

    int updateByPrimaryKeySelective(ShopConfigs record);

    int updateByPrimaryKey(ShopConfigs record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ShopConfigs record, Criteria example);

    int updateByParams(ShopConfigs record, Criteria example);

    int insert(ShopConfigs record);

    int insertSelective(ShopConfigs record);
}