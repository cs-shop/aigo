package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.UserAddress;
import java.util.List;

public interface UserAddressService {
    int countByParams(Criteria example);

    UserAddress selectByPrimaryKey(Integer addressid);

    List<UserAddress> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer addressid);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(UserAddress record, Criteria example);

    int updateByParams(UserAddress record, Criteria example);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);
}