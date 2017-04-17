package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.User;
import java.util.List;

public interface UserService {
    int countByParams(Criteria example);

    User selectByPrimaryKey(Integer userId);

    List<User> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(User record, Criteria example);

    int updateByParams(User record, Criteria example);

    int insert(User record);

    int insertSelective(User record);
}