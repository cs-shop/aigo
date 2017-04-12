package com.cs.service;

import com.cs.pojo.AdPosition;
import com.cs.pojo.Criteria;
import java.util.List;

public interface AdPositionService {
    int countByParams(Criteria example);

    AdPosition selectByPrimaryKey(Integer positionid);

    List<AdPosition> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer positionid);

    int updateByPrimaryKeySelective(AdPosition record);

    int updateByPrimaryKey(AdPosition record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(AdPosition record, Criteria example);

    int updateByParams(AdPosition record, Criteria example);

    int insert(AdPosition record);

    int insertSelective(AdPosition record);
}