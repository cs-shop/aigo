package com.cs.service;

import com.cs.pojo.Brand;
import com.cs.pojo.Criteria;
import java.util.List;

public interface BrandService {
    int countByParams(Criteria example);

    Brand selectByPrimaryKey(Integer brandid);

    List<Brand> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer brandid);

    int updateByPrimaryKeySelective(Brand record);

    int updateByPrimaryKey(Brand record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Brand record, Criteria example);

    int updateByParams(Brand record, Criteria example);

    int insert(Brand record);

    int insertSelective(Brand record);
}