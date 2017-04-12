package com.cs.service.impl;

import com.cs.dao.OrderSettlementMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.OrderSettlement;
import com.cs.service.OrderSettlementService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderSettlementServiceImpl implements OrderSettlementService {
    @Autowired
    private OrderSettlementMapper orderSettlementMapper;

    private static final Logger logger = LoggerFactory.getLogger(OrderSettlementServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.orderSettlementMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public OrderSettlement selectByPrimaryKey(Integer settlementid) {
        return this.orderSettlementMapper.selectByPrimaryKey(settlementid);
    }

    public List<OrderSettlement> selectByParams(Criteria example) {
        return this.orderSettlementMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer settlementid) {
        return this.orderSettlementMapper.deleteByPrimaryKey(settlementid);
    }

    public int updateByPrimaryKeySelective(OrderSettlement record) {
        return this.orderSettlementMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderSettlement record) {
        return this.orderSettlementMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.orderSettlementMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(OrderSettlement record, Criteria example) {
        return this.orderSettlementMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(OrderSettlement record, Criteria example) {
        return this.orderSettlementMapper.updateByParams(record, example.getCondition());
    }

    public int insert(OrderSettlement record) {
        return this.orderSettlementMapper.insert(record);
    }

    public int insertSelective(OrderSettlement record) {
        return this.orderSettlementMapper.insertSelective(record);
    }
}