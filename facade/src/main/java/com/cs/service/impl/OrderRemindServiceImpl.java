package com.cs.service.impl;

import com.cs.dao.OrderRemindMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.OrderRemind;
import com.cs.service.OrderRemindService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderRemindServiceImpl implements OrderRemindService {
    @Autowired
    private OrderRemindMapper orderRemindMapper;

    private static final Logger logger = LoggerFactory.getLogger(OrderRemindServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.orderRemindMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public OrderRemind selectByPrimaryKey(Integer remindid) {
        return this.orderRemindMapper.selectByPrimaryKey(remindid);
    }

    public List<OrderRemind> selectByParams(Criteria example) {
        return this.orderRemindMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer remindid) {
        return this.orderRemindMapper.deleteByPrimaryKey(remindid);
    }

    public int updateByPrimaryKeySelective(OrderRemind record) {
        return this.orderRemindMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(OrderRemind record) {
        return this.orderRemindMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.orderRemindMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(OrderRemind record, Criteria example) {
        return this.orderRemindMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(OrderRemind record, Criteria example) {
        return this.orderRemindMapper.updateByParams(record, example.getCondition());
    }

    public int insert(OrderRemind record) {
        return this.orderRemindMapper.insert(record);
    }

    public int insertSelective(OrderRemind record) {
        return this.orderRemindMapper.insertSelective(record);
    }
}