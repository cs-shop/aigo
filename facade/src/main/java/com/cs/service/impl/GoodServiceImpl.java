package com.cs.service.impl;

import com.cs.dao.GoodMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Good;
import com.cs.service.GoodService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodServiceImpl implements GoodService {
    @Autowired
    private GoodMapper goodMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Good selectByPrimaryKey(Integer goodsid) {
        return this.goodMapper.selectByPrimaryKey(goodsid);
    }

    public List<Good> selectByParams(Criteria example) {
        return this.goodMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer goodsid) {
        return this.goodMapper.deleteByPrimaryKey(goodsid);
    }

    public int updateByPrimaryKeySelective(Good record) {
        return this.goodMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Good record) {
        return this.goodMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Good record, Criteria example) {
        return this.goodMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Good record, Criteria example) {
        return this.goodMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Good record) {
        return this.goodMapper.insert(record);
    }

    public int insertSelective(Good record) {
        return this.goodMapper.insertSelective(record);
    }
}