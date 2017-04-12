package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Staffs;
import java.util.List;

public interface StaffsService {
    int countByParams(Criteria example);

    Staffs selectByPrimaryKey(Integer staffid);

    List<Staffs> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer staffid);

    int updateByPrimaryKeySelective(Staffs record);

    int updateByPrimaryKey(Staffs record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Staffs record, Criteria example);

    int updateByParams(Staffs record, Criteria example);

    int insert(Staffs record);

    int insertSelective(Staffs record);
}