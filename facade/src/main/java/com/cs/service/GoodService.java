package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Good;
import java.util.List;

public interface GoodService {
    int countByParams(Criteria example);

    Good selectByPrimaryKey(Integer goodsid);

    List<Good> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer goodsid);

    int updateByPrimaryKeySelective(Good record);

    int updateByPrimaryKey(Good record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Good record, Criteria example);

    int updateByParams(Good record, Criteria example);

    int insert(Good record);

    int insertSelective(Good record);
}