package com.hptsic.cloud.res.service;

import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResPool;
import java.util.List;

public interface ResPoolService {
    int countByParams(Criteria example);

    ResPool selectByPrimaryKey(String resPoolSid);

    List<ResPool> selectByParams(Criteria example);

    int deleteByPrimaryKey(String resPoolSid);

    int updateByPrimaryKeySelective(ResPool record);

    int updateByPrimaryKey(ResPool record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ResPool record, Criteria example);

    int updateByParams(ResPool record, Criteria example);

    int insert(ResPool record);

    int insertSelective(ResPool record);
}