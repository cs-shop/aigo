package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.LogSysMoney;
import java.util.List;

public interface LogSysMoneyService {
    int countByParams(Criteria example);

    LogSysMoney selectByPrimaryKey(Integer moneyid);

    List<LogSysMoney> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer moneyid);

    int updateByPrimaryKeySelective(LogSysMoney record);

    int updateByPrimaryKey(LogSysMoney record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(LogSysMoney record, Criteria example);

    int updateByParams(LogSysMoney record, Criteria example);

    int insert(LogSysMoney record);

    int insertSelective(LogSysMoney record);
}