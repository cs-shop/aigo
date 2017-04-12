package com.cs.service.impl;

import com.cs.dao.LogSysMoneyMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.LogSysMoney;
import com.cs.service.LogSysMoneyService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogSysMoneyServiceImpl implements LogSysMoneyService {
    @Autowired
    private LogSysMoneyMapper logSysMoneyMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogSysMoneyServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.logSysMoneyMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LogSysMoney selectByPrimaryKey(Integer moneyid) {
        return this.logSysMoneyMapper.selectByPrimaryKey(moneyid);
    }

    public List<LogSysMoney> selectByParams(Criteria example) {
        return this.logSysMoneyMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer moneyid) {
        return this.logSysMoneyMapper.deleteByPrimaryKey(moneyid);
    }

    public int updateByPrimaryKeySelective(LogSysMoney record) {
        return this.logSysMoneyMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LogSysMoney record) {
        return this.logSysMoneyMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.logSysMoneyMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(LogSysMoney record, Criteria example) {
        return this.logSysMoneyMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(LogSysMoney record, Criteria example) {
        return this.logSysMoneyMapper.updateByParams(record, example.getCondition());
    }

    public int insert(LogSysMoney record) {
        return this.logSysMoneyMapper.insert(record);
    }

    public int insertSelective(LogSysMoney record) {
        return this.logSysMoneyMapper.insertSelective(record);
    }
}