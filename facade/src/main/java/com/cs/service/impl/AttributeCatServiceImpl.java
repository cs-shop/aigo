package com.cs.service.impl;

import com.cs.dao.AttributeCatMapper;
import com.cs.pojo.AttributeCat;
import com.cs.pojo.Criteria;
import com.cs.service.AttributeCatService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeCatServiceImpl implements AttributeCatService {
    @Autowired
    private AttributeCatMapper attributeCatMapper;

    private static final Logger logger = LoggerFactory.getLogger(AttributeCatServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.attributeCatMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public AttributeCat selectByPrimaryKey(Integer catid) {
        return this.attributeCatMapper.selectByPrimaryKey(catid);
    }

    public List<AttributeCat> selectByParams(Criteria example) {
        return this.attributeCatMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer catid) {
        return this.attributeCatMapper.deleteByPrimaryKey(catid);
    }

    public int updateByPrimaryKeySelective(AttributeCat record) {
        return this.attributeCatMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(AttributeCat record) {
        return this.attributeCatMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.attributeCatMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(AttributeCat record, Criteria example) {
        return this.attributeCatMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(AttributeCat record, Criteria example) {
        return this.attributeCatMapper.updateByParams(record, example.getCondition());
    }

    public int insert(AttributeCat record) {
        return this.attributeCatMapper.insert(record);
    }

    public int insertSelective(AttributeCat record) {
        return this.attributeCatMapper.insertSelective(record);
    }
}