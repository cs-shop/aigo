package com.cs.service.impl;

import com.cs.dao.GoodsRelatedMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsRelated;
import com.cs.service.GoodsRelatedService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsRelatedServiceImpl implements GoodsRelatedService {
    @Autowired
    private GoodsRelatedMapper goodsRelatedMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodsRelatedServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodsRelatedMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoodsRelated selectByPrimaryKey(Integer id) {
        return this.goodsRelatedMapper.selectByPrimaryKey(id);
    }

    public List<GoodsRelated> selectByParams(Criteria example) {
        return this.goodsRelatedMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.goodsRelatedMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(GoodsRelated record) {
        return this.goodsRelatedMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoodsRelated record) {
        return this.goodsRelatedMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodsRelatedMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GoodsRelated record, Criteria example) {
        return this.goodsRelatedMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GoodsRelated record, Criteria example) {
        return this.goodsRelatedMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GoodsRelated record) {
        return this.goodsRelatedMapper.insert(record);
    }

    public int insertSelective(GoodsRelated record) {
        return this.goodsRelatedMapper.insertSelective(record);
    }
}