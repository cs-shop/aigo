package com.cs.service.impl;

import com.cs.dao.NavMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Nav;
import com.cs.service.NavService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NavServiceImpl implements NavService {
    @Autowired
    private NavMapper navMapper;

    private static final Logger logger = LoggerFactory.getLogger(NavServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.navMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Nav selectByPrimaryKey(Integer id) {
        return this.navMapper.selectByPrimaryKey(id);
    }

    public List<Nav> selectByParams(Criteria example) {
        return this.navMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.navMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Nav record) {
        return this.navMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Nav record) {
        return this.navMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.navMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Nav record, Criteria example) {
        return this.navMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Nav record, Criteria example) {
        return this.navMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Nav record) {
        return this.navMapper.insert(record);
    }

    public int insertSelective(Nav record) {
        return this.navMapper.insertSelective(record);
    }
}