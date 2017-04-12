package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GroupsGood;
import java.util.List;

public interface GroupsGoodService {
    int countByParams(Criteria example);

    GroupsGood selectByPrimaryKey(Integer id);

    List<GroupsGood> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GroupsGood record);

    int updateByPrimaryKey(GroupsGood record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GroupsGood record, Criteria example);

    int updateByParams(GroupsGood record, Criteria example);

    int insert(GroupsGood record);

    int insertSelective(GroupsGood record);
}