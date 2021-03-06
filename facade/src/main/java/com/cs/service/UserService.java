package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.User;
import java.util.List;

public interface UserService {
    int countByParams(Criteria example);

    User selectByPrimaryKey(Long userSid);

    List<User> selectByParams(Criteria example);

    int deleteByPrimaryKey(Long userSid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(User record, Criteria example);

    int updateByParams(User record, Criteria example);

    int insert(User record);

    int insertSelective(User record);
}