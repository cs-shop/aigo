package com.cs.service.impl;

import com.cs.dao.GoodsGalleryMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsGallery;
import com.cs.service.GoodsGalleryService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsGalleryServiceImpl implements GoodsGalleryService {
    @Autowired
    private GoodsGalleryMapper goodsGalleryMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodsGalleryServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodsGalleryMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoodsGallery selectByPrimaryKey(Integer id) {
        return this.goodsGalleryMapper.selectByPrimaryKey(id);
    }

    public List<GoodsGallery> selectByParams(Criteria example) {
        return this.goodsGalleryMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.goodsGalleryMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(GoodsGallery record) {
        return this.goodsGalleryMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoodsGallery record) {
        return this.goodsGalleryMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodsGalleryMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GoodsGallery record, Criteria example) {
        return this.goodsGalleryMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GoodsGallery record, Criteria example) {
        return this.goodsGalleryMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GoodsGallery record) {
        return this.goodsGalleryMapper.insert(record);
    }

    public int insertSelective(GoodsGallery record) {
        return this.goodsGalleryMapper.insertSelective(record);
    }
}