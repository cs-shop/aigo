package com.cs.service;

import com.cs.pojo.Ad;
import com.cs.pojo.Criteria;
import java.util.List;

public interface AdService {
    int countByParams(Criteria example);

    Ad selectByPrimaryKey(Integer adid);

    List<Ad> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer adid);

    int updateByPrimaryKeySelective(Ad record);

    int updateByPrimaryKey(Ad record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Ad record, Criteria example);

    int updateByParams(Ad record, Criteria example);

    int insert(Ad record);

    int insertSelective(Ad record);
}