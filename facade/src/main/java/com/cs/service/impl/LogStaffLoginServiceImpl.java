package com.cs.service.impl;

import com.cs.dao.LogStaffLoginMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.LogStaffLogin;
import com.cs.service.LogStaffLoginService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogStaffLoginServiceImpl implements LogStaffLoginService {
    @Autowired
    private LogStaffLoginMapper logStaffLoginMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogStaffLoginServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.logStaffLoginMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LogStaffLogin selectByPrimaryKey(Integer loginid) {
        return this.logStaffLoginMapper.selectByPrimaryKey(loginid);
    }

    public List<LogStaffLogin> selectByParams(Criteria example) {
        return this.logStaffLoginMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer loginid) {
        return this.logStaffLoginMapper.deleteByPrimaryKey(loginid);
    }

    public int updateByPrimaryKeySelective(LogStaffLogin record) {
        return this.logStaffLoginMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LogStaffLogin record) {
        return this.logStaffLoginMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.logStaffLoginMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(LogStaffLogin record, Criteria example) {
        return this.logStaffLoginMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(LogStaffLogin record, Criteria example) {
        return this.logStaffLoginMapper.updateByParams(record, example.getCondition());
    }

    public int insert(LogStaffLogin record) {
        return this.logStaffLoginMapper.insert(record);
    }

    public int insertSelective(LogStaffLogin record) {
        return this.logStaffLoginMapper.insertSelective(record);
    }
}