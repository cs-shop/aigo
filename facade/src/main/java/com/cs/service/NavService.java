package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Nav;
import java.util.List;

public interface NavService {
    int countByParams(Criteria example);

    Nav selectByPrimaryKey(Integer id);

    List<Nav> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Nav record);

    int updateByPrimaryKey(Nav record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Nav record, Criteria example);

    int updateByParams(Nav record, Criteria example);

    int insert(Nav record);

    int insertSelective(Nav record);
}