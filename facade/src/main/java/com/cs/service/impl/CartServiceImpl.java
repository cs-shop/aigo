package com.cs.service.impl;

import com.cs.dao.CartMapper;
import com.cs.pojo.Cart;
import com.cs.pojo.Criteria;
import com.cs.service.CartService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;

    private static final Logger logger = LoggerFactory.getLogger(CartServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.cartMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Cart selectByPrimaryKey(Integer cartid) {
        return this.cartMapper.selectByPrimaryKey(cartid);
    }

    public List<Cart> selectByParams(Criteria example) {
        return this.cartMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer cartid) {
        return this.cartMapper.deleteByPrimaryKey(cartid);
    }

    public int updateByPrimaryKeySelective(Cart record) {
        return this.cartMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Cart record) {
        return this.cartMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.cartMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Cart record, Criteria example) {
        return this.cartMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Cart record, Criteria example) {
        return this.cartMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Cart record) {
        return this.cartMapper.insert(record);
    }

    public int insertSelective(Cart record) {
        return this.cartMapper.insertSelective(record);
    }
}