package com.cs.service.impl;

import com.cs.dao.SysConfigsMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.SysConfigs;
import com.cs.service.SysConfigsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysConfigsServiceImpl implements SysConfigsService {
    @Autowired
    private SysConfigsMapper sysConfigsMapper;

    private static final Logger logger = LoggerFactory.getLogger(SysConfigsServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.sysConfigsMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public SysConfigs selectByPrimaryKey(Integer configid) {
        return this.sysConfigsMapper.selectByPrimaryKey(configid);
    }

    public List<SysConfigs> selectByParams(Criteria example) {
        return this.sysConfigsMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer configid) {
        return this.sysConfigsMapper.deleteByPrimaryKey(configid);
    }

    public int updateByPrimaryKeySelective(SysConfigs record) {
        return this.sysConfigsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(SysConfigs record) {
        return this.sysConfigsMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.sysConfigsMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(SysConfigs record, Criteria example) {
        return this.sysConfigsMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(SysConfigs record, Criteria example) {
        return this.sysConfigsMapper.updateByParams(record, example.getCondition());
    }

    public int insert(SysConfigs record) {
        return this.sysConfigsMapper.insert(record);
    }

    public int insertSelective(SysConfigs record) {
        return this.sysConfigsMapper.insertSelective(record);
    }
}