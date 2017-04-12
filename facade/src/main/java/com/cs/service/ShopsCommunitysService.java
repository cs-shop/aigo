package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.ShopsCommunitys;
import java.util.List;

public interface ShopsCommunitysService {
    int countByParams(Criteria example);

    ShopsCommunitys selectByPrimaryKey(Integer id);

    List<ShopsCommunitys> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopsCommunitys record);

    int updateByPrimaryKey(ShopsCommunitys record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ShopsCommunitys record, Criteria example);

    int updateByParams(ShopsCommunitys record, Criteria example);

    int insert(ShopsCommunitys record);

    int insertSelective(ShopsCommunitys record);
}