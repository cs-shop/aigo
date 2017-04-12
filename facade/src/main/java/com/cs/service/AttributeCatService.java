package com.cs.service;

import com.cs.pojo.AttributeCat;
import com.cs.pojo.Criteria;
import java.util.List;

public interface AttributeCatService {
    int countByParams(Criteria example);

    AttributeCat selectByPrimaryKey(Integer catid);

    List<AttributeCat> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer catid);

    int updateByPrimaryKeySelective(AttributeCat record);

    int updateByPrimaryKey(AttributeCat record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(AttributeCat record, Criteria example);

    int updateByParams(AttributeCat record, Criteria example);

    int insert(AttributeCat record);

    int insertSelective(AttributeCat record);
}