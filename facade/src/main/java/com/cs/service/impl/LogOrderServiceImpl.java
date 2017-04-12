package com.cs.service.impl;

import com.cs.dao.LogOrderMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.LogOrder;
import com.cs.service.LogOrderService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogOrderServiceImpl implements LogOrderService {
    @Autowired
    private LogOrderMapper logOrderMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogOrderServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.logOrderMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LogOrder selectByPrimaryKey(Integer logid) {
        return this.logOrderMapper.selectByPrimaryKey(logid);
    }

    public List<LogOrder> selectByParams(Criteria example) {
        return this.logOrderMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer logid) {
        return this.logOrderMapper.deleteByPrimaryKey(logid);
    }

    public int updateByPrimaryKeySelective(LogOrder record) {
        return this.logOrderMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LogOrder record) {
        return this.logOrderMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.logOrderMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(LogOrder record, Criteria example) {
        return this.logOrderMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(LogOrder record, Criteria example) {
        return this.logOrderMapper.updateByParams(record, example.getCondition());
    }

    public int insert(LogOrder record) {
        return this.logOrderMapper.insert(record);
    }

    public int insertSelective(LogOrder record) {
        return this.logOrderMapper.insertSelective(record);
    }
}