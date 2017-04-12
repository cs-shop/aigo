package com.cs.service.impl;

import com.cs.dao.DistributUserMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.DistributUser;
import com.cs.service.DistributUserService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistributUserServiceImpl implements DistributUserService {
    @Autowired
    private DistributUserMapper distributUserMapper;

    private static final Logger logger = LoggerFactory.getLogger(DistributUserServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.distributUserMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public DistributUser selectByPrimaryKey(Integer distributid) {
        return this.distributUserMapper.selectByPrimaryKey(distributid);
    }

    public List<DistributUser> selectByParams(Criteria example) {
        return this.distributUserMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer distributid) {
        return this.distributUserMapper.deleteByPrimaryKey(distributid);
    }

    public int updateByPrimaryKeySelective(DistributUser record) {
        return this.distributUserMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(DistributUser record) {
        return this.distributUserMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.distributUserMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(DistributUser record, Criteria example) {
        return this.distributUserMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(DistributUser record, Criteria example) {
        return this.distributUserMapper.updateByParams(record, example.getCondition());
    }

    public int insert(DistributUser record) {
        return this.distributUserMapper.insert(record);
    }

    public int insertSelective(DistributUser record) {
        return this.distributUserMapper.insertSelective(record);
    }
}