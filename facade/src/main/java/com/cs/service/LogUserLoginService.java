package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.LogUserLogin;
import java.util.List;

public interface LogUserLoginService {
    int countByParams(Criteria example);

    LogUserLogin selectByPrimaryKey(Integer loginid);

    List<LogUserLogin> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer loginid);

    int updateByPrimaryKeySelective(LogUserLogin record);

    int updateByPrimaryKey(LogUserLogin record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(LogUserLogin record, Criteria example);

    int updateByParams(LogUserLogin record, Criteria example);

    int insert(LogUserLogin record);

    int insertSelective(LogUserLogin record);
}