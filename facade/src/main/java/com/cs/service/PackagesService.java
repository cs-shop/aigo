package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Packages;
import java.util.List;

public interface PackagesService {
    int countByParams(Criteria example);

    Packages selectByPrimaryKey(Integer packageid);

    List<Packages> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer packageid);

    int updateByPrimaryKeySelective(Packages record);

    int updateByPrimaryKey(Packages record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Packages record, Criteria example);

    int updateByParams(Packages record, Criteria example);

    int insert(Packages record);

    int insertSelective(Packages record);
}