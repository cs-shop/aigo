package com.cs.service;

import com.cs.pojo.Article;
import com.cs.pojo.Criteria;
import java.util.List;

public interface ArticleService {
    int countByParams(Criteria example);

    Article selectByPrimaryKey(Integer articleid);

    List<Article> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer articleid);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKey(Article record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Article record, Criteria example);

    int updateByParams(Article record, Criteria example);

    int insert(Article record);

    int insertSelective(Article record);
}