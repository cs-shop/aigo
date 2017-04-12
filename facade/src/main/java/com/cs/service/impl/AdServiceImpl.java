package com.cs.service.impl;

import com.cs.dao.AdMapper;
import com.cs.pojo.Ad;
import com.cs.pojo.Criteria;
import com.cs.service.AdService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdServiceImpl implements AdService {
    @Autowired
    private AdMapper adMapper;

    private static final Logger logger = LoggerFactory.getLogger(AdServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.adMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Ad selectByPrimaryKey(Integer adid) {
        return this.adMapper.selectByPrimaryKey(adid);
    }

    public List<Ad> selectByParams(Criteria example) {
        return this.adMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer adid) {
        return this.adMapper.deleteByPrimaryKey(adid);
    }

    public int updateByPrimaryKeySelective(Ad record) {
        return this.adMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Ad record) {
        return this.adMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.adMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Ad record, Criteria example) {
        return this.adMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Ad record, Criteria example) {
        return this.adMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Ad record) {
        return this.adMapper.insert(record);
    }

    public int insertSelective(Ad record) {
        return this.adMapper.insertSelective(record);
    }
}