package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.LogOrder;
import java.util.List;

public interface LogOrderService {
    int countByParams(Criteria example);

    LogOrder selectByPrimaryKey(Integer logid);

    List<LogOrder> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer logid);

    int updateByPrimaryKeySelective(LogOrder record);

    int updateByPrimaryKey(LogOrder record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(LogOrder record, Criteria example);

    int updateByParams(LogOrder record, Criteria example);

    int insert(LogOrder record);

    int insertSelective(LogOrder record);
}