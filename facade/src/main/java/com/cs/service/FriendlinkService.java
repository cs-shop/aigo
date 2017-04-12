package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Friendlink;
import java.util.List;

public interface FriendlinkService {
    int countByParams(Criteria example);

    Friendlink selectByPrimaryKey(Integer friendlinkid);

    List<Friendlink> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer friendlinkid);

    int updateByPrimaryKeySelective(Friendlink record);

    int updateByPrimaryKey(Friendlink record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Friendlink record, Criteria example);

    int updateByParams(Friendlink record, Criteria example);

    int insert(Friendlink record);

    int insertSelective(Friendlink record);
}