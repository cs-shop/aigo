package com.hptsic.cloud.res.service.impl;

import com.hptsic.cloud.res.dao.ResVeMapper;
import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResVe;
import com.hptsic.cloud.res.service.ResVeService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResVeServiceImpl implements ResVeService {
    @Autowired
    private ResVeMapper resVeMapper;

    private static final Logger logger = LoggerFactory.getLogger(ResVeServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.resVeMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ResVe selectByPrimaryKey(String resVeSid) {
        return this.resVeMapper.selectByPrimaryKey(resVeSid);
    }

    public List<ResVe> selectByParams(Criteria example) {
        return this.resVeMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(String resVeSid) {
        return this.resVeMapper.deleteByPrimaryKey(resVeSid);
    }

    public int updateByPrimaryKeySelective(ResVe record) {
        return this.resVeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ResVe record) {
        return this.resVeMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.resVeMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ResVe record, Criteria example) {
        return this.resVeMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ResVe record, Criteria example) {
        return this.resVeMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ResVe record) {
        return this.resVeMapper.insert(record);
    }

    public int insertSelective(ResVe record) {
        return this.resVeMapper.insertSelective(record);
    }
}