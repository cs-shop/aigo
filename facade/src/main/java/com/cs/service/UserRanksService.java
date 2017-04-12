package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.UserRanks;
import java.util.List;

public interface UserRanksService {
    int countByParams(Criteria example);

    UserRanks selectByPrimaryKey(Integer rankid);

    List<UserRanks> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer rankid);

    int updateByPrimaryKeySelective(UserRanks record);

    int updateByPrimaryKey(UserRanks record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(UserRanks record, Criteria example);

    int updateByParams(UserRanks record, Criteria example);

    int insert(UserRanks record);

    int insertSelective(UserRanks record);
}