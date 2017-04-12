package com.cs.service.impl;

import com.cs.dao.OrderidMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Orderid;
import com.cs.service.OrderidService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderidServiceImpl implements OrderidService {
    @Autowired
    private OrderidMapper orderidMapper;

    private static final Logger logger = LoggerFactory.getLogger(OrderidServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.orderidMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Orderid selectByPrimaryKey(Long id) {
        return this.orderidMapper.selectByPrimaryKey(id);
    }

    public List<Orderid> selectByParams(Criteria example) {
        return this.orderidMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Long id) {
        return this.orderidMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Orderid record) {
        return this.orderidMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Orderid record) {
        return this.orderidMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.orderidMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Orderid record, Criteria example) {
        return this.orderidMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Orderid record, Criteria example) {
        return this.orderidMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Orderid record) {
        return this.orderidMapper.insert(record);
    }

    public int insertSelective(Orderid record) {
        return this.orderidMapper.insertSelective(record);
    }
}