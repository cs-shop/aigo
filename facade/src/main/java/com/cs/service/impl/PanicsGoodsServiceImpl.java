package com.cs.service.impl;

import com.cs.dao.PanicsGoodsMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.PanicsGoods;
import com.cs.service.PanicsGoodsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanicsGoodsServiceImpl implements PanicsGoodsService {
    @Autowired
    private PanicsGoodsMapper panicsGoodsMapper;

    private static final Logger logger = LoggerFactory.getLogger(PanicsGoodsServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.panicsGoodsMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public PanicsGoods selectByPrimaryKey(Integer id) {
        return this.panicsGoodsMapper.selectByPrimaryKey(id);
    }

    public List<PanicsGoods> selectByParams(Criteria example) {
        return this.panicsGoodsMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.panicsGoodsMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(PanicsGoods record) {
        return this.panicsGoodsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(PanicsGoods record) {
        return this.panicsGoodsMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.panicsGoodsMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(PanicsGoods record, Criteria example) {
        return this.panicsGoodsMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(PanicsGoods record, Criteria example) {
        return this.panicsGoodsMapper.updateByParams(record, example.getCondition());
    }

    public int insert(PanicsGoods record) {
        return this.panicsGoodsMapper.insert(record);
    }

    public int insertSelective(PanicsGoods record) {
        return this.panicsGoodsMapper.insertSelective(record);
    }
}