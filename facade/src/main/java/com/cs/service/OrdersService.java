package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Orders;
import java.util.List;

public interface OrdersService {
    int countByParams(Criteria example);

    Orders selectByPrimaryKey(Integer orderid);

    List<Orders> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Orders record);

    int updateByPrimaryKey(Orders record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Orders record, Criteria example);

    int updateByParams(Orders record, Criteria example);

    int insert(Orders record);

    int insertSelective(Orders record);
}