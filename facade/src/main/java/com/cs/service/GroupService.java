package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Group;
import java.util.List;

public interface GroupService {
    int countByParams(Criteria example);

    Group selectByPrimaryKey(Integer groupid);

    List<Group> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer groupid);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Group record, Criteria example);

    int updateByParams(Group record, Criteria example);

    int insert(Group record);

    int insertSelective(Group record);
}