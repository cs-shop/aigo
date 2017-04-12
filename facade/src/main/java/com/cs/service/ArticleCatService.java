package com.cs.service;

import com.cs.pojo.ArticleCat;
import com.cs.pojo.Criteria;
import java.util.List;

public interface ArticleCatService {
    int countByParams(Criteria example);

    ArticleCat selectByPrimaryKey(Integer catid);

    List<ArticleCat> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer catid);

    int updateByPrimaryKeySelective(ArticleCat record);

    int updateByPrimaryKey(ArticleCat record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ArticleCat record, Criteria example);

    int updateByParams(ArticleCat record, Criteria example);

    int insert(ArticleCat record);

    int insertSelective(ArticleCat record);
}