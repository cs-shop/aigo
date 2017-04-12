package com.cs.service.impl;

import com.cs.dao.AreaMapper;
import com.cs.pojo.Area;
import com.cs.pojo.Criteria;
import com.cs.service.AreaService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;

    private static final Logger logger = LoggerFactory.getLogger(AreaServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.areaMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Area selectByPrimaryKey(Integer areaid) {
        return this.areaMapper.selectByPrimaryKey(areaid);
    }

    public List<Area> selectByParams(Criteria example) {
        return this.areaMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer areaid) {
        return this.areaMapper.deleteByPrimaryKey(areaid);
    }

    public int updateByPrimaryKeySelective(Area record) {
        return this.areaMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Area record) {
        return this.areaMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.areaMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Area record, Criteria example) {
        return this.areaMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Area record, Criteria example) {
        return this.areaMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Area record) {
        return this.areaMapper.insert(record);
    }

    public int insertSelective(Area record) {
        return this.areaMapper.insertSelective(record);
    }
}