package com.cs.service;

import com.cs.pojo.Bank;
import com.cs.pojo.Criteria;
import java.util.List;

public interface BankService {
    int countByParams(Criteria example);

    Bank selectByPrimaryKey(Integer bankid);

    List<Bank> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer bankid);

    int updateByPrimaryKeySelective(Bank record);

    int updateByPrimaryKey(Bank record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Bank record, Criteria example);

    int updateByParams(Bank record, Criteria example);

    int insert(Bank record);

    int insertSelective(Bank record);
}