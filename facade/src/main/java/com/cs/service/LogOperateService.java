package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.LogOperate;
import java.util.List;

public interface LogOperateService {
    int countByParams(Criteria example);

    LogOperate selectByPrimaryKey(Integer operateid);

    List<LogOperate> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer operateid);

    int updateByPrimaryKeySelective(LogOperate record);

    int updateByPrimaryKey(LogOperate record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(LogOperate record, Criteria example);

    int updateByParams(LogOperate record, Criteria example);

    int insert(LogOperate record);

    int insertSelective(LogOperate record);
}