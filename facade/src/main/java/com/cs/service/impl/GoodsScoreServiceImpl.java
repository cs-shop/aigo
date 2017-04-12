package com.cs.service.impl;

import com.cs.dao.GoodsScoreMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsScore;
import com.cs.service.GoodsScoreService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsScoreServiceImpl implements GoodsScoreService {
    @Autowired
    private GoodsScoreMapper goodsScoreMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodsScoreServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodsScoreMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoodsScore selectByPrimaryKey(Integer scoreid) {
        return this.goodsScoreMapper.selectByPrimaryKey(scoreid);
    }

    public List<GoodsScore> selectByParams(Criteria example) {
        return this.goodsScoreMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer scoreid) {
        return this.goodsScoreMapper.deleteByPrimaryKey(scoreid);
    }

    public int updateByPrimaryKeySelective(GoodsScore record) {
        return this.goodsScoreMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoodsScore record) {
        return this.goodsScoreMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodsScoreMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GoodsScore record, Criteria example) {
        return this.goodsScoreMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GoodsScore record, Criteria example) {
        return this.goodsScoreMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GoodsScore record) {
        return this.goodsScoreMapper.insert(record);
    }

    public int insertSelective(GoodsScore record) {
        return this.goodsScoreMapper.insertSelective(record);
    }
}