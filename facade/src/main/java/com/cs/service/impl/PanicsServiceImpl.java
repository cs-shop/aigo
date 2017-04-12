package com.cs.service.impl;

import com.cs.dao.PanicsMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Panics;
import com.cs.service.PanicsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PanicsServiceImpl implements PanicsService {
    @Autowired
    private PanicsMapper panicsMapper;

    private static final Logger logger = LoggerFactory.getLogger(PanicsServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.panicsMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Panics selectByPrimaryKey(Integer panicid) {
        return this.panicsMapper.selectByPrimaryKey(panicid);
    }

    public List<Panics> selectByParams(Criteria example) {
        return this.panicsMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer panicid) {
        return this.panicsMapper.deleteByPrimaryKey(panicid);
    }

    public int updateByPrimaryKeySelective(Panics record) {
        return this.panicsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Panics record) {
        return this.panicsMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.panicsMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Panics record, Criteria example) {
        return this.panicsMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Panics record, Criteria example) {
        return this.panicsMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Panics record) {
        return this.panicsMapper.insert(record);
    }

    public int insertSelective(Panics record) {
        return this.panicsMapper.insertSelective(record);
    }
}