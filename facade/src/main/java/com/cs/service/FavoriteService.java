package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Favorite;
import java.util.List;

public interface FavoriteService {
    int countByParams(Criteria example);

    Favorite selectByPrimaryKey(Integer favoriteid);

    List<Favorite> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer favoriteid);

    int updateByPrimaryKeySelective(Favorite record);

    int updateByPrimaryKey(Favorite record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Favorite record, Criteria example);

    int updateByParams(Favorite record, Criteria example);

    int insert(Favorite record);

    int insertSelective(Favorite record);
}