package com.hptsic.cloud.sys.service.impl;

import com.hptsic.cloud.sys.dao.ResVdMapper;
import com.hptsic.cloud.sys.pojo.Criteria;
import com.hptsic.cloud.sys.pojo.ResVd;
import com.hptsic.cloud.sys.service.ResVdService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResVdServiceImpl implements ResVdService {
    @Autowired
    private ResVdMapper resVdMapper;

    private static final Logger logger = LoggerFactory.getLogger(ResVdServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.resVdMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ResVd selectByPrimaryKey(String resVdSid) {
        return this.resVdMapper.selectByPrimaryKey(resVdSid);
    }

    public List<ResVd> selectByParams(Criteria example) {
        return this.resVdMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(String resVdSid) {
        return this.resVdMapper.deleteByPrimaryKey(resVdSid);
    }

    public int updateByPrimaryKeySelective(ResVd record) {
        return this.resVdMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ResVd record) {
        return this.resVdMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.resVdMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ResVd record, Criteria example) {
        return this.resVdMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ResVd record, Criteria example) {
        return this.resVdMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ResVd record) {
        return this.resVdMapper.insert(record);
    }

    public int insertSelective(ResVd record) {
        return this.resVdMapper.insertSelective(record);
    }
}