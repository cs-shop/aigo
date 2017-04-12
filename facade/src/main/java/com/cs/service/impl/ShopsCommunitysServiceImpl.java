package com.cs.service.impl;

import com.cs.dao.ShopsCommunitysMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.ShopsCommunitys;
import com.cs.service.ShopsCommunitysService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopsCommunitysServiceImpl implements ShopsCommunitysService {
    @Autowired
    private ShopsCommunitysMapper shopsCommunitysMapper;

    private static final Logger logger = LoggerFactory.getLogger(ShopsCommunitysServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.shopsCommunitysMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ShopsCommunitys selectByPrimaryKey(Integer id) {
        return this.shopsCommunitysMapper.selectByPrimaryKey(id);
    }

    public List<ShopsCommunitys> selectByParams(Criteria example) {
        return this.shopsCommunitysMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.shopsCommunitysMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(ShopsCommunitys record) {
        return this.shopsCommunitysMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ShopsCommunitys record) {
        return this.shopsCommunitysMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.shopsCommunitysMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ShopsCommunitys record, Criteria example) {
        return this.shopsCommunitysMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ShopsCommunitys record, Criteria example) {
        return this.shopsCommunitysMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ShopsCommunitys record) {
        return this.shopsCommunitysMapper.insert(record);
    }

    public int insertSelective(ShopsCommunitys record) {
        return this.shopsCommunitysMapper.insertSelective(record);
    }
}