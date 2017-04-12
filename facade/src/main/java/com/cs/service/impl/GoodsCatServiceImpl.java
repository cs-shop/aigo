package com.cs.service.impl;

import com.cs.dao.GoodsCatMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsCat;
import com.cs.service.GoodsCatService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsCatServiceImpl implements GoodsCatService {
    @Autowired
    private GoodsCatMapper goodsCatMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodsCatServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodsCatMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoodsCat selectByPrimaryKey(Integer catid) {
        return this.goodsCatMapper.selectByPrimaryKey(catid);
    }

    public List<GoodsCat> selectByParams(Criteria example) {
        return this.goodsCatMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer catid) {
        return this.goodsCatMapper.deleteByPrimaryKey(catid);
    }

    public int updateByPrimaryKeySelective(GoodsCat record) {
        return this.goodsCatMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoodsCat record) {
        return this.goodsCatMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodsCatMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GoodsCat record, Criteria example) {
        return this.goodsCatMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GoodsCat record, Criteria example) {
        return this.goodsCatMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GoodsCat record) {
        return this.goodsCatMapper.insert(record);
    }

    public int insertSelective(GoodsCat record) {
        return this.goodsCatMapper.insertSelective(record);
    }
}