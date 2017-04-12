package com.cs.service.impl;

import com.cs.dao.FavoriteMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Favorite;
import com.cs.service.FavoriteService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteServiceImpl implements FavoriteService {
    @Autowired
    private FavoriteMapper favoriteMapper;

    private static final Logger logger = LoggerFactory.getLogger(FavoriteServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.favoriteMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Favorite selectByPrimaryKey(Integer favoriteid) {
        return this.favoriteMapper.selectByPrimaryKey(favoriteid);
    }

    public List<Favorite> selectByParams(Criteria example) {
        return this.favoriteMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer favoriteid) {
        return this.favoriteMapper.deleteByPrimaryKey(favoriteid);
    }

    public int updateByPrimaryKeySelective(Favorite record) {
        return this.favoriteMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Favorite record) {
        return this.favoriteMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.favoriteMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Favorite record, Criteria example) {
        return this.favoriteMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Favorite record, Criteria example) {
        return this.favoriteMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Favorite record) {
        return this.favoriteMapper.insert(record);
    }

    public int insertSelective(Favorite record) {
        return this.favoriteMapper.insertSelective(record);
    }
}