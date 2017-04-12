package com.cs.service.impl;

import com.cs.dao.CashConfigMapper;
import com.cs.pojo.CashConfig;
import com.cs.pojo.Criteria;
import com.cs.service.CashConfigService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashConfigServiceImpl implements CashConfigService {
    @Autowired
    private CashConfigMapper cashConfigMapper;

    private static final Logger logger = LoggerFactory.getLogger(CashConfigServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.cashConfigMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public CashConfig selectByPrimaryKey(Integer id) {
        return this.cashConfigMapper.selectByPrimaryKey(id);
    }

    public List<CashConfig> selectByParams(Criteria example) {
        return this.cashConfigMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.cashConfigMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(CashConfig record) {
        return this.cashConfigMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CashConfig record) {
        return this.cashConfigMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.cashConfigMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(CashConfig record, Criteria example) {
        return this.cashConfigMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(CashConfig record, Criteria example) {
        return this.cashConfigMapper.updateByParams(record, example.getCondition());
    }

    public int insert(CashConfig record) {
        return this.cashConfigMapper.insert(record);
    }

    public int insertSelective(CashConfig record) {
        return this.cashConfigMapper.insertSelective(record);
    }
}