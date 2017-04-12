package com.cs.service.impl;

import com.cs.dao.ShopMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Shop;
import com.cs.service.ShopService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopMapper shopMapper;

    private static final Logger logger = LoggerFactory.getLogger(ShopServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.shopMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Shop selectByPrimaryKey(Integer shopid) {
        return this.shopMapper.selectByPrimaryKey(shopid);
    }

    public List<Shop> selectByParams(Criteria example) {
        return this.shopMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer shopid) {
        return this.shopMapper.deleteByPrimaryKey(shopid);
    }

    public int updateByPrimaryKeySelective(Shop record) {
        return this.shopMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Shop record) {
        return this.shopMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.shopMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Shop record, Criteria example) {
        return this.shopMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Shop record, Criteria example) {
        return this.shopMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Shop record) {
        return this.shopMapper.insert(record);
    }

    public int insertSelective(Shop record) {
        return this.shopMapper.insertSelective(record);
    }
}