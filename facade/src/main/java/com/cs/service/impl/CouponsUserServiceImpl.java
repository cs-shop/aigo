package com.cs.service.impl;

import com.cs.dao.CouponsUserMapper;
import com.cs.pojo.CouponsUser;
import com.cs.pojo.Criteria;
import com.cs.service.CouponsUserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponsUserServiceImpl implements CouponsUserService {
    @Autowired
    private CouponsUserMapper couponsUserMapper;

    private static final Logger logger = LoggerFactory.getLogger(CouponsUserServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.couponsUserMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public CouponsUser selectByPrimaryKey(Integer id) {
        return this.couponsUserMapper.selectByPrimaryKey(id);
    }

    public List<CouponsUser> selectByParams(Criteria example) {
        return this.couponsUserMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.couponsUserMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(CouponsUser record) {
        return this.couponsUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(CouponsUser record) {
        return this.couponsUserMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.couponsUserMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(CouponsUser record, Criteria example) {
        return this.couponsUserMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(CouponsUser record, Criteria example) {
        return this.couponsUserMapper.updateByParams(record, example.getCondition());
    }

    public int insert(CouponsUser record) {
        return this.couponsUserMapper.insert(record);
    }

    public int insertSelective(CouponsUser record) {
        return this.couponsUserMapper.insertSelective(record);
    }
}