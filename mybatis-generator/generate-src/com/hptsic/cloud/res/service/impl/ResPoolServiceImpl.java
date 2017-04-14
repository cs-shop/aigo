package com.hptsic.cloud.res.service.impl;

import com.hptsic.cloud.res.dao.ResPoolMapper;
import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResPool;
import com.hptsic.cloud.res.service.ResPoolService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResPoolServiceImpl implements ResPoolService {
    @Autowired
    private ResPoolMapper resPoolMapper;

    private static final Logger logger = LoggerFactory.getLogger(ResPoolServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.resPoolMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ResPool selectByPrimaryKey(String resPoolSid) {
        return this.resPoolMapper.selectByPrimaryKey(resPoolSid);
    }

    public List<ResPool> selectByParams(Criteria example) {
        return this.resPoolMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(String resPoolSid) {
        return this.resPoolMapper.deleteByPrimaryKey(resPoolSid);
    }

    public int updateByPrimaryKeySelective(ResPool record) {
        return this.resPoolMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ResPool record) {
        return this.resPoolMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.resPoolMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ResPool record, Criteria example) {
        return this.resPoolMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ResPool record, Criteria example) {
        return this.resPoolMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ResPool record) {
        return this.resPoolMapper.insert(record);
    }

    public int insertSelective(ResPool record) {
        return this.resPoolMapper.insertSelective(record);
    }
}