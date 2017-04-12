package com.cs.service.impl;

import com.cs.dao.GoodsAppraiseMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsAppraise;
import com.cs.service.GoodsAppraiseService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsAppraiseServiceImpl implements GoodsAppraiseService {
    @Autowired
    private GoodsAppraiseMapper goodsAppraiseMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodsAppraiseServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodsAppraiseMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoodsAppraise selectByPrimaryKey(Integer id) {
        return this.goodsAppraiseMapper.selectByPrimaryKey(id);
    }

    public List<GoodsAppraise> selectByParams(Criteria example) {
        return this.goodsAppraiseMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.goodsAppraiseMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(GoodsAppraise record) {
        return this.goodsAppraiseMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoodsAppraise record) {
        return this.goodsAppraiseMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodsAppraiseMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GoodsAppraise record, Criteria example) {
        return this.goodsAppraiseMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GoodsAppraise record, Criteria example) {
        return this.goodsAppraiseMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GoodsAppraise record) {
        return this.goodsAppraiseMapper.insert(record);
    }

    public int insertSelective(GoodsAppraise record) {
        return this.goodsAppraiseMapper.insertSelective(record);
    }
}