package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.ShopScores;
import java.util.List;

public interface ShopScoresService {
    int countByParams(Criteria example);

    ShopScores selectByPrimaryKey(Integer scoreid);

    List<ShopScores> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(ShopScores record);

    int updateByPrimaryKey(ShopScores record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ShopScores record, Criteria example);

    int updateByParams(ShopScores record, Criteria example);

    int insert(ShopScores record);

    int insertSelective(ShopScores record);
}