package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsRelated;
import java.util.List;

public interface GoodsRelatedService {
    int countByParams(Criteria example);

    GoodsRelated selectByPrimaryKey(Integer id);

    List<GoodsRelated> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsRelated record);

    int updateByPrimaryKey(GoodsRelated record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GoodsRelated record, Criteria example);

    int updateByParams(GoodsRelated record, Criteria example);

    int insert(GoodsRelated record);

    int insertSelective(GoodsRelated record);
}