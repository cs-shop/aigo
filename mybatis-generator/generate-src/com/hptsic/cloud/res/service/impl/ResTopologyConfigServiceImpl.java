package com.hptsic.cloud.res.service.impl;

import com.hptsic.cloud.res.dao.ResTopologyConfigMapper;
import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResTopologyConfig;
import com.hptsic.cloud.res.service.ResTopologyConfigService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResTopologyConfigServiceImpl implements ResTopologyConfigService {
    @Autowired
    private ResTopologyConfigMapper resTopologyConfigMapper;

    private static final Logger logger = LoggerFactory.getLogger(ResTopologyConfigServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.resTopologyConfigMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ResTopologyConfig selectByPrimaryKey(String configId) {
        return this.resTopologyConfigMapper.selectByPrimaryKey(configId);
    }

    public List<ResTopologyConfig> selectByParams(Criteria example) {
        return this.resTopologyConfigMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(String configId) {
        return this.resTopologyConfigMapper.deleteByPrimaryKey(configId);
    }

    public int updateByPrimaryKeySelective(ResTopologyConfig record) {
        return this.resTopologyConfigMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ResTopologyConfig record) {
        return this.resTopologyConfigMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.resTopologyConfigMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ResTopologyConfig record, Criteria example) {
        return this.resTopologyConfigMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ResTopologyConfig record, Criteria example) {
        return this.resTopologyConfigMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ResTopologyConfig record) {
        return this.resTopologyConfigMapper.insert(record);
    }

    public int insertSelective(ResTopologyConfig record) {
        return this.resTopologyConfigMapper.insertSelective(record);
    }
}