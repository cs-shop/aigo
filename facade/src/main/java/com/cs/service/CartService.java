package com.cs.service;

import com.cs.pojo.Cart;
import com.cs.pojo.Criteria;
import java.util.List;

public interface CartService {
    int countByParams(Criteria example);

    Cart selectByPrimaryKey(Integer cartid);

    List<Cart> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer cartid);

    int updateByPrimaryKeySelective(Cart record);

    int updateByPrimaryKey(Cart record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Cart record, Criteria example);

    int updateByParams(Cart record, Criteria example);

    int insert(Cart record);

    int insertSelective(Cart record);
}