package com.cs.service.impl;

import com.cs.dao.LogUserLoginMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.LogUserLogin;
import com.cs.service.LogUserLoginService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogUserLoginServiceImpl implements LogUserLoginService {
    @Autowired
    private LogUserLoginMapper logUserLoginMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogUserLoginServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.logUserLoginMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LogUserLogin selectByPrimaryKey(Integer loginid) {
        return this.logUserLoginMapper.selectByPrimaryKey(loginid);
    }

    public List<LogUserLogin> selectByParams(Criteria example) {
        return this.logUserLoginMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer loginid) {
        return this.logUserLoginMapper.deleteByPrimaryKey(loginid);
    }

    public int updateByPrimaryKeySelective(LogUserLogin record) {
        return this.logUserLoginMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LogUserLogin record) {
        return this.logUserLoginMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.logUserLoginMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(LogUserLogin record, Criteria example) {
        return this.logUserLoginMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(LogUserLogin record, Criteria example) {
        return this.logUserLoginMapper.updateByParams(record, example.getCondition());
    }

    public int insert(LogUserLogin record) {
        return this.logUserLoginMapper.insert(record);
    }

    public int insertSelective(LogUserLogin record) {
        return this.logUserLoginMapper.insertSelective(record);
    }
}