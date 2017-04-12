package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.ShopsCats;
import java.util.List;

public interface ShopsCatsService {
    int countByParams(Criteria example);

    ShopsCats selectByPrimaryKey(Integer catid);

    List<ShopsCats> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer catid);

    int updateByPrimaryKeySelective(ShopsCats record);

    int updateByPrimaryKey(ShopsCats record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ShopsCats record, Criteria example);

    int updateByParams(ShopsCats record, Criteria example);

    int insert(ShopsCats record);

    int insertSelective(ShopsCats record);
}