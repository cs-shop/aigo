package com.cs.service.impl;

import com.cs.dao.UserAddressMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.UserAddress;
import com.cs.service.UserAddressService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressMapper userAddressMapper;

    private static final Logger logger = LoggerFactory.getLogger(UserAddressServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.userAddressMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public UserAddress selectByPrimaryKey(Integer addressid) {
        return this.userAddressMapper.selectByPrimaryKey(addressid);
    }

    public List<UserAddress> selectByParams(Criteria example) {
        return this.userAddressMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer addressid) {
        return this.userAddressMapper.deleteByPrimaryKey(addressid);
    }

    public int updateByPrimaryKeySelective(UserAddress record) {
        return this.userAddressMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(UserAddress record) {
        return this.userAddressMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.userAddressMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(UserAddress record, Criteria example) {
        return this.userAddressMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(UserAddress record, Criteria example) {
        return this.userAddressMapper.updateByParams(record, example.getCondition());
    }

    public int insert(UserAddress record) {
        return this.userAddressMapper.insert(record);
    }

    public int insertSelective(UserAddress record) {
        return this.userAddressMapper.insertSelective(record);
    }
}