package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.LogStaffLogin;
import java.util.List;

public interface LogStaffLoginService {
    int countByParams(Criteria example);

    LogStaffLogin selectByPrimaryKey(Integer loginid);

    List<LogStaffLogin> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer loginid);

    int updateByPrimaryKeySelective(LogStaffLogin record);

    int updateByPrimaryKey(LogStaffLogin record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(LogStaffLogin record, Criteria example);

    int updateByParams(LogStaffLogin record, Criteria example);

    int insert(LogStaffLogin record);

    int insertSelective(LogStaffLogin record);
}