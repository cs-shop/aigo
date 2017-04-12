package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsAttribute;
import java.util.List;

public interface GoodsAttributeService {
    int countByParams(Criteria example);

    GoodsAttribute selectByPrimaryKey(Integer id);

    List<GoodsAttribute> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsAttribute record);

    int updateByPrimaryKey(GoodsAttribute record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GoodsAttribute record, Criteria example);

    int updateByParams(GoodsAttribute record, Criteria example);

    int insert(GoodsAttribute record);

    int insertSelective(GoodsAttribute record);
}