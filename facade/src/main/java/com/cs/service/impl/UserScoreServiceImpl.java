package com.cs.service.impl;

import com.cs.dao.UserScoreMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.UserScore;
import com.cs.service.UserScoreService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserScoreServiceImpl implements UserScoreService {
    @Autowired
    private UserScoreMapper userScoreMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserScoreServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.userScoreMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserScore selectByPrimaryKey(Integer scoreid) {
        return this.userScoreMapper.selectByPrimaryKey(scoreid);
    }

    public List<UserScore> selectByParams(Criteria example) {
        return this.userScoreMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer scoreid) {
        return this.userScoreMapper.deleteByPrimaryKey(scoreid);
    }

    public int updateByPrimaryKeySelective(UserScore record) {
        return this.userScoreMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserScore record) {
        return this.userScoreMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.userScoreMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(UserScore record, Criteria example) {
        return this.userScoreMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(UserScore record, Criteria example) {
        return this.userScoreMapper.updateByParams(record, example.getCondition());
    }

    public int insert(UserScore record) {
        return this.userScoreMapper.insert(record);
    }

    public int insertSelective(UserScore record) {
        return this.userScoreMapper.insertSelective(record);
    }
}