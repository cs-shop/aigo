package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsPackage;
import java.util.List;

public interface GoodsPackageService {
    int countByParams(Criteria example);

    GoodsPackage selectByPrimaryKey(Integer id);

    List<GoodsPackage> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsPackage record);

    int updateByPrimaryKey(GoodsPackage record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GoodsPackage record, Criteria example);

    int updateByParams(GoodsPackage record, Criteria example);

    int insert(GoodsPackage record);

    int insertSelective(GoodsPackage record);
}