package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsAppraise;
import java.util.List;

public interface GoodsAppraiseService {
    int countByParams(Criteria example);

    GoodsAppraise selectByPrimaryKey(Integer id);

    List<GoodsAppraise> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsAppraise record);

    int updateByPrimaryKey(GoodsAppraise record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GoodsAppraise record, Criteria example);

    int updateByParams(GoodsAppraise record, Criteria example);

    int insert(GoodsAppraise record);

    int insertSelective(GoodsAppraise record);
}