package com.cs.service.impl;

import com.cs.dao.ArticleCatMapper;
import com.cs.pojo.ArticleCat;
import com.cs.pojo.Criteria;
import com.cs.service.ArticleCatService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleCatServiceImpl implements ArticleCatService {
    @Autowired
    private ArticleCatMapper articleCatMapper;

    private static final Logger logger = LoggerFactory.getLogger(ArticleCatServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.articleCatMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ArticleCat selectByPrimaryKey(Integer catid) {
        return this.articleCatMapper.selectByPrimaryKey(catid);
    }

    public List<ArticleCat> selectByParams(Criteria example) {
        return this.articleCatMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer catid) {
        return this.articleCatMapper.deleteByPrimaryKey(catid);
    }

    public int updateByPrimaryKeySelective(ArticleCat record) {
        return this.articleCatMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ArticleCat record) {
        return this.articleCatMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.articleCatMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ArticleCat record, Criteria example) {
        return this.articleCatMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ArticleCat record, Criteria example) {
        return this.articleCatMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ArticleCat record) {
        return this.articleCatMapper.insert(record);
    }

    public int insertSelective(ArticleCat record) {
        return this.articleCatMapper.insertSelective(record);
    }
}