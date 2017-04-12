package com.cs.service.impl;

import com.cs.dao.DistributMoneyMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.DistributMoney;
import com.cs.service.DistributMoneyService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistributMoneyServiceImpl implements DistributMoneyService {
    @Autowired
    private DistributMoneyMapper distributMoneyMapper;

    private static final Logger logger = LoggerFactory.getLogger(DistributMoneyServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.distributMoneyMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public DistributMoney selectByPrimaryKey(Integer moneyid) {
        return this.distributMoneyMapper.selectByPrimaryKey(moneyid);
    }

    public List<DistributMoney> selectByParams(Criteria example) {
        return this.distributMoneyMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer moneyid) {
        return this.distributMoneyMapper.deleteByPrimaryKey(moneyid);
    }

    public int updateByPrimaryKeySelective(DistributMoney record) {
        return this.distributMoneyMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DistributMoney record) {
        return this.distributMoneyMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.distributMoneyMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(DistributMoney record, Criteria example) {
        return this.distributMoneyMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(DistributMoney record, Criteria example) {
        return this.distributMoneyMapper.updateByParams(record, example.getCondition());
    }

    public int insert(DistributMoney record) {
        return this.distributMoneyMapper.insert(record);
    }

    public int insertSelective(DistributMoney record) {
        return this.distributMoneyMapper.insertSelective(record);
    }
}