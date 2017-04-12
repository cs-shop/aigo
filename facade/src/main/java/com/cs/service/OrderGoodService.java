package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.OrderGood;
import java.util.List;

public interface OrderGoodService {
    int countByParams(Criteria example);

    OrderGood selectByPrimaryKey(Integer id);

    List<OrderGood> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderGood record);

    int updateByPrimaryKey(OrderGood record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(OrderGood record, Criteria example);

    int updateByParams(OrderGood record, Criteria example);

    int insert(OrderGood record);

    int insertSelective(OrderGood record);
}