package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsScore;
import java.util.List;

public interface GoodsScoreService {
    int countByParams(Criteria example);

    GoodsScore selectByPrimaryKey(Integer scoreid);

    List<GoodsScore> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(GoodsScore record);

    int updateByPrimaryKey(GoodsScore record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GoodsScore record, Criteria example);

    int updateByParams(GoodsScore record, Criteria example);

    int insert(GoodsScore record);

    int insertSelective(GoodsScore record);
}