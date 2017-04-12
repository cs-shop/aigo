package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Feedback;
import java.util.List;

public interface FeedbackService {
    int countByParams(Criteria example);

    Feedback selectByPrimaryKey(Integer feedbackid);

    List<Feedback> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer feedbackid);

    int updateByPrimaryKeySelective(Feedback record);

    int updateByPrimaryKey(Feedback record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Feedback record, Criteria example);

    int updateByParams(Feedback record, Criteria example);

    int insert(Feedback record);

    int insertSelective(Feedback record);
}