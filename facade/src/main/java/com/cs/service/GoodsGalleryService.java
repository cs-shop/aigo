package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsGallery;
import java.util.List;

public interface GoodsGalleryService {
    int countByParams(Criteria example);

    GoodsGallery selectByPrimaryKey(Integer id);

    List<GoodsGallery> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsGallery record);

    int updateByPrimaryKey(GoodsGallery record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GoodsGallery record, Criteria example);

    int updateByParams(GoodsGallery record, Criteria example);

    int insert(GoodsGallery record);

    int insertSelective(GoodsGallery record);
}