package com.cs.service;

import com.cs.pojo.Community;
import com.cs.pojo.Criteria;
import java.util.List;

public interface CommunityService {
    int countByParams(Criteria example);

    Community selectByPrimaryKey(Integer communityid);

    List<Community> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer communityid);

    int updateByPrimaryKeySelective(Community record);

    int updateByPrimaryKey(Community record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Community record, Criteria example);

    int updateByParams(Community record, Criteria example);

    int insert(Community record);

    int insertSelective(Community record);
}