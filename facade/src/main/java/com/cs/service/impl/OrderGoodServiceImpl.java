package com.cs.service.impl;

import com.cs.dao.OrderGoodMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.OrderGood;
import com.cs.service.OrderGoodService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderGoodServiceImpl implements OrderGoodService {
    @Autowired
    private OrderGoodMapper orderGoodMapper;

    private static final Logger logger = LoggerFactory.getLogger(OrderGoodServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.orderGoodMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public OrderGood selectByPrimaryKey(Integer id) {
        return this.orderGoodMapper.selectByPrimaryKey(id);
    }

    public List<OrderGood> selectByParams(Criteria example) {
        return this.orderGoodMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.orderGoodMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(OrderGood record) {
        return this.orderGoodMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderGood record) {
        return this.orderGoodMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.orderGoodMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(OrderGood record, Criteria example) {
        return this.orderGoodMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(OrderGood record, Criteria example) {
        return this.orderGoodMapper.updateByParams(record, example.getCondition());
    }

    public int insert(OrderGood record) {
        return this.orderGoodMapper.insert(record);
    }

    public int insertSelective(OrderGood record) {
        return this.orderGoodMapper.insertSelective(record);
    }
}