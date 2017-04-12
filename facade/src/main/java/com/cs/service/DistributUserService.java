package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.DistributUser;
import java.util.List;

public interface DistributUserService {
    int countByParams(Criteria example);

    DistributUser selectByPrimaryKey(Integer distributid);

    List<DistributUser> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer distributid);

    int updateByPrimaryKeySelective(DistributUser record);

    int updateByPrimaryKey(DistributUser record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(DistributUser record, Criteria example);

    int updateByParams(DistributUser record, Criteria example);

    int insert(DistributUser record);

    int insertSelective(DistributUser record);
}