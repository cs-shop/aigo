package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Payments;
import java.util.List;

public interface PaymentsService {
    int countByParams(Criteria example);

    Payments selectByPrimaryKey(Integer id);

    List<Payments> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Payments record);

    int updateByPrimaryKey(Payments record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Payments record, Criteria example);

    int updateByParams(Payments record, Criteria example);

    int insert(Payments record);

    int insertSelective(Payments record);
}