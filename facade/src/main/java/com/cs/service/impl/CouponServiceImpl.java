package com.cs.service.impl;

import com.cs.dao.CouponMapper;
import com.cs.pojo.Coupon;
import com.cs.pojo.Criteria;
import com.cs.service.CouponService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CouponServiceImpl implements CouponService {
    @Autowired
    private CouponMapper couponMapper;

    private static final Logger logger = LoggerFactory.getLogger(CouponServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.couponMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Coupon selectByPrimaryKey(Integer couponid) {
        return this.couponMapper.selectByPrimaryKey(couponid);
    }

    public List<Coupon> selectByParams(Criteria example) {
        return this.couponMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer couponid) {
        return this.couponMapper.deleteByPrimaryKey(couponid);
    }

    public int updateByPrimaryKeySelective(Coupon record) {
        return this.couponMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Coupon record) {
        return this.couponMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.couponMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Coupon record, Criteria example) {
        return this.couponMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Coupon record, Criteria example) {
        return this.couponMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Coupon record) {
        return this.couponMapper.insert(record);
    }

    public int insertSelective(Coupon record) {
        return this.couponMapper.insertSelective(record);
    }
}