package com.cs.service.impl;

import com.cs.dao.StylesMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Styles;
import com.cs.service.StylesService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StylesServiceImpl implements StylesService {
    @Autowired
    private StylesMapper stylesMapper;

    private static final Logger logger = LoggerFactory.getLogger(StylesServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.stylesMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Styles selectByPrimaryKey(Integer id) {
        return this.stylesMapper.selectByPrimaryKey(id);
    }

    public List<Styles> selectByParams(Criteria example) {
        return this.stylesMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.stylesMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(Styles record) {
        return this.stylesMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Styles record) {
        return this.stylesMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.stylesMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Styles record, Criteria example) {
        return this.stylesMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Styles record, Criteria example) {
        return this.stylesMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Styles record) {
        return this.stylesMapper.insert(record);
    }

    public int insertSelective(Styles record) {
        return this.stylesMapper.insertSelective(record);
    }
}