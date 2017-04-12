package com.cs.service.impl;

import com.cs.dao.PaymentsMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Payments;
import com.cs.service.PaymentsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentsServiceImpl implements PaymentsService {
    @Autowired
    private PaymentsMapper paymentsMapper;

    private static final Logger logger = LoggerFactory.getLogger(PaymentsServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.paymentsMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Payments selectByPrimaryKey(Integer id) {
        return this.paymentsMapper.selectByPrimaryKey(id);
    }

    public List<Payments> selectByParams(Criteria example) {
        return this.paymentsMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.paymentsMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Payments record) {
        return this.paymentsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Payments record) {
        return this.paymentsMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.paymentsMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Payments record, Criteria example) {
        return this.paymentsMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Payments record, Criteria example) {
        return this.paymentsMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Payments record) {
        return this.paymentsMapper.insert(record);
    }

    public int insertSelective(Payments record) {
        return this.paymentsMapper.insertSelective(record);
    }
}