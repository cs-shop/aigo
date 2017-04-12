package com.cs.service.impl;

import com.cs.dao.ShopsCatsMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.ShopsCats;
import com.cs.service.ShopsCatsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopsCatsServiceImpl implements ShopsCatsService {
    @Autowired
    private ShopsCatsMapper shopsCatsMapper;

    private static final Logger logger = LoggerFactory.getLogger(ShopsCatsServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.shopsCatsMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ShopsCats selectByPrimaryKey(Integer catid) {
        return this.shopsCatsMapper.selectByPrimaryKey(catid);
    }

    public List<ShopsCats> selectByParams(Criteria example) {
        return this.shopsCatsMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer catid) {
        return this.shopsCatsMapper.deleteByPrimaryKey(catid);
    }

    public int updateByPrimaryKeySelective(ShopsCats record) {
        return this.shopsCatsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ShopsCats record) {
        return this.shopsCatsMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.shopsCatsMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ShopsCats record, Criteria example) {
        return this.shopsCatsMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ShopsCats record, Criteria example) {
        return this.shopsCatsMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ShopsCats record) {
        return this.shopsCatsMapper.insert(record);
    }

    public int insertSelective(ShopsCats record) {
        return this.shopsCatsMapper.insertSelective(record);
    }
}