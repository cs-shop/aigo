package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.DistributMoney;
import java.util.List;

public interface DistributMoneyService {
    int countByParams(Criteria example);

    DistributMoney selectByPrimaryKey(Integer moneyid);

    List<DistributMoney> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer moneyid);

    int updateByPrimaryKeySelective(DistributMoney record);

    int updateByPrimaryKey(DistributMoney record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(DistributMoney record, Criteria example);

    int updateByParams(DistributMoney record, Criteria example);

    int insert(DistributMoney record);

    int insertSelective(DistributMoney record);
}