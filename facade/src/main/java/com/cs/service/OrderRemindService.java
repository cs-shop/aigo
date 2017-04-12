package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.OrderRemind;
import java.util.List;

public interface OrderRemindService {
    int countByParams(Criteria example);

    OrderRemind selectByPrimaryKey(Integer remindid);

    List<OrderRemind> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer remindid);

    int updateByPrimaryKeySelective(OrderRemind record);

    int updateByPrimaryKey(OrderRemind record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(OrderRemind record, Criteria example);

    int updateByParams(OrderRemind record, Criteria example);

    int insert(OrderRemind record);

    int insertSelective(OrderRemind record);
}