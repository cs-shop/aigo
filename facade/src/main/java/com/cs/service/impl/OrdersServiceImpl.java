package com.cs.service.impl;

import com.cs.dao.OrdersMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Orders;
import com.cs.service.OrdersService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersServiceImpl implements OrdersService {
    @Autowired
    private OrdersMapper ordersMapper;

    private static final Logger logger = LoggerFactory.getLogger(OrdersServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.ordersMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Orders selectByPrimaryKey(Integer orderid) {
        return this.ordersMapper.selectByPrimaryKey(orderid);
    }

    public List<Orders> selectByParams(Criteria example) {
        return this.ordersMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer orderid) {
        return this.ordersMapper.deleteByPrimaryKey(orderid);
    }

    public int updateByPrimaryKeySelective(Orders record) {
        return this.ordersMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Orders record) {
        return this.ordersMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.ordersMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Orders record, Criteria example) {
        return this.ordersMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Orders record, Criteria example) {
        return this.ordersMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Orders record) {
        return this.ordersMapper.insert(record);
    }

    public int insertSelective(Orders record) {
        return this.ordersMapper.insertSelective(record);
    }
}