package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Orderid;
import java.util.List;

public interface OrderidService {
    int countByParams(Criteria example);

    Orderid selectByPrimaryKey(Long id);

    List<Orderid> selectByParams(Criteria example);

    int deleteByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Orderid record);

    int updateByPrimaryKey(Orderid record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Orderid record, Criteria example);

    int updateByParams(Orderid record, Criteria example);

    int insert(Orderid record);

    int insertSelective(Orderid record);
}