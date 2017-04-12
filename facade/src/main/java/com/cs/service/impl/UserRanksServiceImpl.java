package com.cs.service.impl;

import com.cs.dao.UserRanksMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.UserRanks;
import com.cs.service.UserRanksService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserRanksServiceImpl implements UserRanksService {
    @Autowired
    private UserRanksMapper userRanksMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserRanksServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.userRanksMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserRanks selectByPrimaryKey(Integer rankid) {
        return this.userRanksMapper.selectByPrimaryKey(rankid);
    }

    public List<UserRanks> selectByParams(Criteria example) {
        return this.userRanksMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer rankid) {
        return this.userRanksMapper.deleteByPrimaryKey(rankid);
    }

    public int updateByPrimaryKeySelective(UserRanks record) {
        return this.userRanksMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserRanks record) {
        return this.userRanksMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.userRanksMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(UserRanks record, Criteria example) {
        return this.userRanksMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(UserRanks record, Criteria example) {
        return this.userRanksMapper.updateByParams(record, example.getCondition());
    }

    public int insert(UserRanks record) {
        return this.userRanksMapper.insert(record);
    }

    public int insertSelective(UserRanks record) {
        return this.userRanksMapper.insertSelective(record);
    }
}