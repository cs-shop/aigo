package com.cs.service.impl;

import com.cs.dao.ArticleMapper;
import com.cs.pojo.Article;
import com.cs.pojo.Criteria;
import com.cs.service.ArticleService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    private static final Logger logger = LoggerFactory.getLogger(ArticleServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.articleMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Article selectByPrimaryKey(Integer articleid) {
        return this.articleMapper.selectByPrimaryKey(articleid);
    }


    public int deleteByPrimaryKey(Integer articleid) {
        return this.articleMapper.deleteByPrimaryKey(articleid);
    }

    public int updateByPrimaryKeySelective(Article record) {
        return this.articleMapper.updateByPrimaryKeySelective(record);
    }


    public int deleteByParams(Criteria example) {
        return this.articleMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Article record, Criteria example) {
        return this.articleMapper.updateByParamsSelective(record, example.getCondition());
    }


    public int insert(Article record) {
        return this.articleMapper.insert(record);
    }

    public int insertSelective(Article record) {
        return this.articleMapper.insertSelective(record);
    }

	@Override
	public List<Article> selectByParams(Criteria example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(Article record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByParams(Article record, Criteria example) {
		// TODO Auto-generated method stub
		return 0;
	}
}