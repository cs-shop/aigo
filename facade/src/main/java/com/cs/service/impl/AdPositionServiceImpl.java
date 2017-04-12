package com.cs.service.impl;

import com.cs.dao.AdPositionMapper;
import com.cs.pojo.AdPosition;
import com.cs.pojo.Criteria;
import com.cs.service.AdPositionService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdPositionServiceImpl implements AdPositionService {
    @Autowired
    private AdPositionMapper adPositionMapper;

    private static final Logger logger = LoggerFactory.getLogger(AdPositionServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.adPositionMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AdPosition selectByPrimaryKey(Integer positionid) {
        return this.adPositionMapper.selectByPrimaryKey(positionid);
    }

    public List<AdPosition> selectByParams(Criteria example) {
        return this.adPositionMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer positionid) {
        return this.adPositionMapper.deleteByPrimaryKey(positionid);
    }

    public int updateByPrimaryKeySelective(AdPosition record) {
        return this.adPositionMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AdPosition record) {
        return this.adPositionMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.adPositionMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(AdPosition record, Criteria example) {
        return this.adPositionMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(AdPosition record, Criteria example) {
        return this.adPositionMapper.updateByParams(record, example.getCondition());
    }

    public int insert(AdPosition record) {
        return this.adPositionMapper.insert(record);
    }

    public int insertSelective(AdPosition record) {
        return this.adPositionMapper.insertSelective(record);
    }
}