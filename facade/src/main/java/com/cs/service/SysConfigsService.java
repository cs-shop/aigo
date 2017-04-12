package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.SysConfigs;
import java.util.List;

public interface SysConfigsService {
    int countByParams(Criteria example);

    SysConfigs selectByPrimaryKey(Integer configid);

    List<SysConfigs> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer configid);

    int updateByPrimaryKeySelective(SysConfigs record);

    int updateByPrimaryKey(SysConfigs record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(SysConfigs record, Criteria example);

    int updateByParams(SysConfigs record, Criteria example);

    int insert(SysConfigs record);

    int insertSelective(SysConfigs record);
}