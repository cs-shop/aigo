package com.cs.service;

import com.cs.pojo.Area;
import com.cs.pojo.Criteria;
import java.util.List;

public interface AreaService {
    int countByParams(Criteria example);

    Area selectByPrimaryKey(Integer areaid);

    List<Area> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer areaid);

    int updateByPrimaryKeySelective(Area record);

    int updateByPrimaryKey(Area record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Area record, Criteria example);

    int updateByParams(Area record, Criteria example);

    int insert(Area record);

    int insertSelective(Area record);
}