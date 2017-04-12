package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.LogSm;
import java.util.List;

public interface LogSmService {
    int countByParams(Criteria example);

    LogSm selectByPrimaryKey(Integer smsid);

    List<LogSm> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer smsid);

    int updateByPrimaryKeySelective(LogSm record);

    int updateByPrimaryKey(LogSm record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(LogSm record, Criteria example);

    int updateByParams(LogSm record, Criteria example);

    int insert(LogSm record);

    int insertSelective(LogSm record);
}