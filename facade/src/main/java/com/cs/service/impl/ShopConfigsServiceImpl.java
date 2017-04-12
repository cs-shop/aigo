package com.cs.service.impl;

import com.cs.dao.ShopConfigsMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.ShopConfigs;
import com.cs.service.ShopConfigsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopConfigsServiceImpl implements ShopConfigsService {
    @Autowired
    private ShopConfigsMapper shopConfigsMapper;

    private static final Logger logger = LoggerFactory.getLogger(ShopConfigsServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.shopConfigsMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ShopConfigs selectByPrimaryKey(Integer configid) {
        return this.shopConfigsMapper.selectByPrimaryKey(configid);
    }

    public List<ShopConfigs> selectByParams(Criteria example) {
        return this.shopConfigsMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer configid) {
        return this.shopConfigsMapper.deleteByPrimaryKey(configid);
    }

    public int updateByPrimaryKeySelective(ShopConfigs record) {
        return this.shopConfigsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ShopConfigs record) {
        return this.shopConfigsMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.shopConfigsMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ShopConfigs record, Criteria example) {
        return this.shopConfigsMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ShopConfigs record, Criteria example) {
        return this.shopConfigsMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ShopConfigs record) {
        return this.shopConfigsMapper.insert(record);
    }

    public int insertSelective(ShopConfigs record) {
        return this.shopConfigsMapper.insertSelective(record);
    }
}