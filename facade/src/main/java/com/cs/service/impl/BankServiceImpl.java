package com.cs.service.impl;

import com.cs.dao.BankMapper;
import com.cs.pojo.Bank;
import com.cs.pojo.Criteria;
import com.cs.service.BankService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankServiceImpl implements BankService {
    @Autowired
    private BankMapper bankMapper;

    private static final Logger logger = LoggerFactory.getLogger(BankServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.bankMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Bank selectByPrimaryKey(Integer bankid) {
        return this.bankMapper.selectByPrimaryKey(bankid);
    }

    public List<Bank> selectByParams(Criteria example) {
        return this.bankMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer bankid) {
        return this.bankMapper.deleteByPrimaryKey(bankid);
    }

    public int updateByPrimaryKeySelective(Bank record) {
        return this.bankMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Bank record) {
        return this.bankMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.bankMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Bank record, Criteria example) {
        return this.bankMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Bank record, Criteria example) {
        return this.bankMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Bank record) {
        return this.bankMapper.insert(record);
    }

    public int insertSelective(Bank record) {
        return this.bankMapper.insertSelective(record);
    }
}