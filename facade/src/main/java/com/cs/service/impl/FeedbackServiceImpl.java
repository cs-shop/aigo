package com.cs.service.impl;

import com.cs.dao.FeedbackMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Feedback;
import com.cs.service.FeedbackService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeedbackServiceImpl implements FeedbackService {
    @Autowired
    private FeedbackMapper feedbackMapper;

    private static final Logger logger = LoggerFactory.getLogger(FeedbackServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.feedbackMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Feedback selectByPrimaryKey(Integer feedbackid) {
        return this.feedbackMapper.selectByPrimaryKey(feedbackid);
    }

    public List<Feedback> selectByParams(Criteria example) {
        return this.feedbackMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer feedbackid) {
        return this.feedbackMapper.deleteByPrimaryKey(feedbackid);
    }

    public int updateByPrimaryKeySelective(Feedback record) {
        return this.feedbackMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Feedback record) {
        return this.feedbackMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.feedbackMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Feedback record, Criteria example) {
        return this.feedbackMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Feedback record, Criteria example) {
        return this.feedbackMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Feedback record) {
        return this.feedbackMapper.insert(record);
    }

    public int insertSelective(Feedback record) {
        return this.feedbackMapper.insertSelective(record);
    }
}