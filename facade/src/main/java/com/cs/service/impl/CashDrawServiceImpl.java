package com.cs.service.impl;

import com.cs.dao.CashDrawMapper;
import com.cs.pojo.CashDraw;
import com.cs.pojo.Criteria;
import com.cs.service.CashDrawService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashDrawServiceImpl implements CashDrawService {
    @Autowired
    private CashDrawMapper cashDrawMapper;

    private static final Logger logger = LoggerFactory.getLogger(CashDrawServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.cashDrawMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public CashDraw selectByPrimaryKey(Integer cashid) {
        return this.cashDrawMapper.selectByPrimaryKey(cashid);
    }

    public List<CashDraw> selectByParams(Criteria example) {
        return this.cashDrawMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer cashid) {
        return this.cashDrawMapper.deleteByPrimaryKey(cashid);
    }

    public int updateByPrimaryKeySelective(CashDraw record) {
        return this.cashDrawMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CashDraw record) {
        return this.cashDrawMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.cashDrawMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(CashDraw record, Criteria example) {
        return this.cashDrawMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(CashDraw record, Criteria example) {
        return this.cashDrawMapper.updateByParams(record, example.getCondition());
    }

    public int insert(CashDraw record) {
        return this.cashDrawMapper.insert(record);
    }

    public int insertSelective(CashDraw record) {
        return this.cashDrawMapper.insertSelective(record);
    }
}