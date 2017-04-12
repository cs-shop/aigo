package com.cs.service;

import com.cs.pojo.Coupon;
import com.cs.pojo.Criteria;
import java.util.List;

public interface CouponService {
    int countByParams(Criteria example);

    Coupon selectByPrimaryKey(Integer couponid);

    List<Coupon> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer couponid);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Coupon record, Criteria example);

    int updateByParams(Coupon record, Criteria example);

    int insert(Coupon record);

    int insertSelective(Coupon record);
}