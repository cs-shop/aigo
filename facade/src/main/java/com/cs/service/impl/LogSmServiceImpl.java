package com.cs.service.impl;

import com.cs.dao.LogSmMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.LogSm;
import com.cs.service.LogSmService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogSmServiceImpl implements LogSmService {
    @Autowired
    private LogSmMapper logSmMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogSmServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.logSmMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LogSm selectByPrimaryKey(Integer smsid) {
        return this.logSmMapper.selectByPrimaryKey(smsid);
    }

    public List<LogSm> selectByParams(Criteria example) {
        return this.logSmMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer smsid) {
        return this.logSmMapper.deleteByPrimaryKey(smsid);
    }

    public int updateByPrimaryKeySelective(LogSm record) {
        return this.logSmMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LogSm record) {
        return this.logSmMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.logSmMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(LogSm record, Criteria example) {
        return this.logSmMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(LogSm record, Criteria example) {
        return this.logSmMapper.updateByParams(record, example.getCondition());
    }

    public int insert(LogSm record) {
        return this.logSmMapper.insert(record);
    }

    public int insertSelective(LogSm record) {
        return this.logSmMapper.insertSelective(record);
    }
}