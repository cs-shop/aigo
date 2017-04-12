package com.cs.service.impl;

import com.cs.dao.LogOperateMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.LogOperate;
import com.cs.service.LogOperateService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogOperateServiceImpl implements LogOperateService {
    @Autowired
    private LogOperateMapper logOperateMapper;

    private static final Logger logger = LoggerFactory.getLogger(LogOperateServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.logOperateMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public LogOperate selectByPrimaryKey(Integer operateid) {
        return this.logOperateMapper.selectByPrimaryKey(operateid);
    }

    public List<LogOperate> selectByParams(Criteria example) {
        return this.logOperateMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer operateid) {
        return this.logOperateMapper.deleteByPrimaryKey(operateid);
    }

    public int updateByPrimaryKeySelective(LogOperate record) {
        return this.logOperateMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(LogOperate record) {
        return this.logOperateMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.logOperateMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(LogOperate record, Criteria example) {
        return this.logOperateMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(LogOperate record, Criteria example) {
        return this.logOperateMapper.updateByParams(record, example.getCondition());
    }

    public int insert(LogOperate record) {
        return this.logOperateMapper.insert(record);
    }

    public int insertSelective(LogOperate record) {
        return this.logOperateMapper.insertSelective(record);
    }
}