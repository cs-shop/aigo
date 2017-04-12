package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Panics;
import java.util.List;

public interface PanicsService {
    int countByParams(Criteria example);

    Panics selectByPrimaryKey(Integer panicid);

    List<Panics> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer panicid);

    int updateByPrimaryKeySelective(Panics record);

    int updateByPrimaryKey(Panics record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Panics record, Criteria example);

    int updateByParams(Panics record, Criteria example);

    int insert(Panics record);

    int insertSelective(Panics record);
}