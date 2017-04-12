package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.OrderSettlement;
import java.util.List;

public interface OrderSettlementService {
    int countByParams(Criteria example);

    OrderSettlement selectByPrimaryKey(Integer settlementid);

    List<OrderSettlement> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer settlementid);

    int updateByPrimaryKeySelective(OrderSettlement record);

    int updateByPrimaryKey(OrderSettlement record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(OrderSettlement record, Criteria example);

    int updateByParams(OrderSettlement record, Criteria example);

    int insert(OrderSettlement record);

    int insertSelective(OrderSettlement record);
}