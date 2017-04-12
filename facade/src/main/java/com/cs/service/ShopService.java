package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Shop;
import java.util.List;

public interface ShopService {
    int countByParams(Criteria example);

    Shop selectByPrimaryKey(Integer shopid);

    List<Shop> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer shopid);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Shop record, Criteria example);

    int updateByParams(Shop record, Criteria example);

    int insert(Shop record);

    int insertSelective(Shop record);
}