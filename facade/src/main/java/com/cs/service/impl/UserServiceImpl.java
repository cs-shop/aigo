package com.cs.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cs.dao.UsersMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.User;
import com.cs.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UsersMapper usersMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.usersMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public User selectByPrimaryKey(Integer id) {
        return this.usersMapper.selectByPrimaryKey(id);
    }

    public List<User> selectByParams(Criteria example) {
        return this.usersMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.usersMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(User record) {
        return this.usersMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(User record) {
        return this.usersMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.usersMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(User record, Criteria example) {
        return this.usersMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(User record, Criteria example) {
        return this.usersMapper.updateByParams(record, example.getCondition());
    }

    public int insert(User record) {
        return this.usersMapper.insert(record);
    }

    public int insertSelective(User record) {
        return this.usersMapper.insertSelective(record);
    }
}