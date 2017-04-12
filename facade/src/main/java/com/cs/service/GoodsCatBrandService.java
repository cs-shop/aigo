package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsCatBrand;
import java.util.List;

public interface GoodsCatBrandService {
    int countByParams(Criteria example);

    GoodsCatBrand selectByPrimaryKey(Integer id);

    List<GoodsCatBrand> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsCatBrand record);

    int updateByPrimaryKey(GoodsCatBrand record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GoodsCatBrand record, Criteria example);

    int updateByParams(GoodsCatBrand record, Criteria example);

    int insert(GoodsCatBrand record);

    int insertSelective(GoodsCatBrand record);
}