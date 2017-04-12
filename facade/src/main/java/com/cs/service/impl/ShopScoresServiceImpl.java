package com.cs.service.impl;

import com.cs.dao.ShopScoresMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.ShopScores;
import com.cs.service.ShopScoresService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopScoresServiceImpl implements ShopScoresService {
    @Autowired
    private ShopScoresMapper shopScoresMapper;

    private static final Logger logger = LoggerFactory.getLogger(ShopScoresServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.shopScoresMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ShopScores selectByPrimaryKey(Integer scoreid) {
        return this.shopScoresMapper.selectByPrimaryKey(scoreid);
    }

    public List<ShopScores> selectByParams(Criteria example) {
        return this.shopScoresMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer scoreid) {
        return this.shopScoresMapper.deleteByPrimaryKey(scoreid);
    }

    public int updateByPrimaryKeySelective(ShopScores record) {
        return this.shopScoresMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ShopScores record) {
        return this.shopScoresMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.shopScoresMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ShopScores record, Criteria example) {
        return this.shopScoresMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ShopScores record, Criteria example) {
        return this.shopScoresMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ShopScores record) {
        return this.shopScoresMapper.insert(record);
    }

    public int insertSelective(ShopScores record) {
        return this.shopScoresMapper.insertSelective(record);
    }
}