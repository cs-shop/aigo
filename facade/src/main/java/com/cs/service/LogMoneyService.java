package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.LogMoney;
import java.util.List;

public interface LogMoneyService {
    int countByParams(Criteria example);

    LogMoney selectByPrimaryKey(Long moneyid);

    List<LogMoney> selectByParams(Criteria example);

    int deleteByPrimaryKey(Long moneyid);

    int updateByPrimaryKeySelective(LogMoney record);

    int updateByPrimaryKey(LogMoney record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(LogMoney record, Criteria example);

    int updateByParams(LogMoney record, Criteria example);

    int insert(LogMoney record);

    int insertSelective(LogMoney record);
}