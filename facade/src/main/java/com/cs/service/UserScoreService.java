package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.UserScore;
import java.util.List;

public interface UserScoreService {
    int countByParams(Criteria example);

    UserScore selectByPrimaryKey(Integer scoreid);

    List<UserScore> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer scoreid);

    int updateByPrimaryKeySelective(UserScore record);

    int updateByPrimaryKey(UserScore record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(UserScore record, Criteria example);

    int updateByParams(UserScore record, Criteria example);

    int insert(UserScore record);

    int insertSelective(UserScore record);
}