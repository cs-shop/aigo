package com.cs.service.impl;

import com.cs.dao.GoodsAttributeMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsAttribute;
import com.cs.service.GoodsAttributeService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsAttributeServiceImpl implements GoodsAttributeService {
    @Autowired
    private GoodsAttributeMapper goodsAttributeMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodsAttributeServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodsAttributeMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoodsAttribute selectByPrimaryKey(Integer id) {
        return this.goodsAttributeMapper.selectByPrimaryKey(id);
    }

    public List<GoodsAttribute> selectByParams(Criteria example) {
        return this.goodsAttributeMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.goodsAttributeMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(GoodsAttribute record) {
        return this.goodsAttributeMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoodsAttribute record) {
        return this.goodsAttributeMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodsAttributeMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GoodsAttribute record, Criteria example) {
        return this.goodsAttributeMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GoodsAttribute record, Criteria example) {
        return this.goodsAttributeMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GoodsAttribute record) {
        return this.goodsAttributeMapper.insert(record);
    }

    public int insertSelective(GoodsAttribute record) {
        return this.goodsAttributeMapper.insertSelective(record);
    }
}