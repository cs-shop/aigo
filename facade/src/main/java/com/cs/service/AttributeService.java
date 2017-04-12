package com.cs.service;

import com.cs.pojo.Attribute;
import com.cs.pojo.Criteria;
import java.util.List;

public interface AttributeService {
    int countByParams(Criteria example);

    Attribute selectByPrimaryKey(Integer attrid);

    List<Attribute> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer attrid);

    int updateByPrimaryKeySelective(Attribute record);

    int updateByPrimaryKey(Attribute record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Attribute record, Criteria example);

    int updateByParams(Attribute record, Criteria example);

    int insert(Attribute record);

    int insertSelective(Attribute record);
}