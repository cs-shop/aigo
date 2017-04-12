package com.cs.service.impl;

import com.cs.dao.OrderComplainMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.OrderComplain;
import com.cs.service.OrderComplainService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderComplainServiceImpl implements OrderComplainService {
    @Autowired
    private OrderComplainMapper orderComplainMapper;

    private static final Logger logger = LoggerFactory.getLogger(OrderComplainServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.orderComplainMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public OrderComplain selectByPrimaryKey(Integer complainid) {
        return this.orderComplainMapper.selectByPrimaryKey(complainid);
    }

    public List<OrderComplain> selectByParams(Criteria example) {
        return this.orderComplainMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer complainid) {
        return this.orderComplainMapper.deleteByPrimaryKey(complainid);
    }

    public int updateByPrimaryKeySelective(OrderComplain record) {
        return this.orderComplainMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderComplain record) {
        return this.orderComplainMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.orderComplainMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(OrderComplain record, Criteria example) {
        return this.orderComplainMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(OrderComplain record, Criteria example) {
        return this.orderComplainMapper.updateByParams(record, example.getCondition());
    }

    public int insert(OrderComplain record) {
        return this.orderComplainMapper.insert(record);
    }

    public int insertSelective(OrderComplain record) {
        return this.orderComplainMapper.insertSelective(record);
    }
}