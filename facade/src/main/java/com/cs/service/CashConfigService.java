package com.cs.service;

import com.cs.pojo.CashConfig;
import com.cs.pojo.Criteria;
import java.util.List;

public interface CashConfigService {
    int countByParams(Criteria example);

    CashConfig selectByPrimaryKey(Integer id);

    List<CashConfig> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CashConfig record);

    int updateByPrimaryKey(CashConfig record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(CashConfig record, Criteria example);

    int updateByParams(CashConfig record, Criteria example);

    int insert(CashConfig record);

    int insertSelective(CashConfig record);
}