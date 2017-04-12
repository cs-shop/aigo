package com.cs.service.impl;

import com.cs.dao.LogMoneyMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.LogMoney;
import com.cs.service.LogMoneyService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogMoneyServiceImpl implements LogMoneyService {
    @Autowired
    private LogMoneyMapper logMoneyMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogMoneyServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.logMoneyMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LogMoney selectByPrimaryKey(Long moneyid) {
        return this.logMoneyMapper.selectByPrimaryKey(moneyid);
    }

    public List<LogMoney> selectByParams(Criteria example) {
        return this.logMoneyMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Long moneyid) {
        return this.logMoneyMapper.deleteByPrimaryKey(moneyid);
    }

    public int updateByPrimaryKeySelective(LogMoney record) {
        return this.logMoneyMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LogMoney record) {
        return this.logMoneyMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.logMoneyMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(LogMoney record, Criteria example) {
        return this.logMoneyMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(LogMoney record, Criteria example) {
        return this.logMoneyMapper.updateByParams(record, example.getCondition());
    }

    public int insert(LogMoney record) {
        return this.logMoneyMapper.insert(record);
    }

    public int insertSelective(LogMoney record) {
        return this.logMoneyMapper.insertSelective(record);
    }
}