package com.hptsic.cloud.res.service.impl;

import com.hptsic.cloud.res.dao.ResNetworkHostMapper;
import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResNetworkHost;
import com.hptsic.cloud.res.service.ResNetworkHostService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResNetworkHostServiceImpl implements ResNetworkHostService {
    @Autowired
    private ResNetworkHostMapper resNetworkHostMapper;

    private static final Logger logger = LoggerFactory.getLogger(ResNetworkHostServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.resNetworkHostMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ResNetworkHost selectByPrimaryKey(ResNetworkHostKey key) {
        return this.resNetworkHostMapper.selectByPrimaryKey(resHostSid,resNetworkSid);
    }

    public List<ResNetworkHost> selectByParams(Criteria example) {
        return this.resNetworkHostMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(ResNetworkHostKey key) {
        return this.resNetworkHostMapper.deleteByPrimaryKey(resHostSid,resNetworkSid);
    }

    public int updateByPrimaryKeySelective(ResNetworkHost record) {
        return this.resNetworkHostMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ResNetworkHost record) {
        return this.resNetworkHostMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.resNetworkHostMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ResNetworkHost record, Criteria example) {
        return this.resNetworkHostMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ResNetworkHost record, Criteria example) {
        return this.resNetworkHostMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ResNetworkHost record) {
        return this.resNetworkHostMapper.insert(record);
    }

    public int insertSelective(ResNetworkHost record) {
        return this.resNetworkHostMapper.insertSelective(record);
    }
}