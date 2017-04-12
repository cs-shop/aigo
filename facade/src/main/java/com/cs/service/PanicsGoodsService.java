package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.PanicsGoods;
import java.util.List;

public interface PanicsGoodsService {
    int countByParams(Criteria example);

    PanicsGoods selectByPrimaryKey(Integer id);

    List<PanicsGoods> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PanicsGoods record);

    int updateByPrimaryKey(PanicsGoods record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(PanicsGoods record, Criteria example);

    int updateByParams(PanicsGoods record, Criteria example);

    int insert(PanicsGoods record);

    int insertSelective(PanicsGoods record);
}