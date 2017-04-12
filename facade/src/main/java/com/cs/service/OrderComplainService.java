package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.OrderComplain;
import java.util.List;

public interface OrderComplainService {
    int countByParams(Criteria example);

    OrderComplain selectByPrimaryKey(Integer complainid);

    List<OrderComplain> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer complainid);

    int updateByPrimaryKeySelective(OrderComplain record);

    int updateByPrimaryKey(OrderComplain record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(OrderComplain record, Criteria example);

    int updateByParams(OrderComplain record, Criteria example);

    int insert(OrderComplain record);

    int insertSelective(OrderComplain record);
}