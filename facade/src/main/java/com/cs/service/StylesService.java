package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Styles;
import java.util.List;

public interface StylesService {
    int countByParams(Criteria example);

    Styles selectByPrimaryKey(Integer id);

    List<Styles> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Styles record);

    int updateByPrimaryKey(Styles record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Styles record, Criteria example);

    int updateByParams(Styles record, Criteria example);

    int insert(Styles record);

    int insertSelective(Styles record);
}