package com.cs.service.impl;

import com.cs.dao.GoodsCatBrandMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsCatBrand;
import com.cs.service.GoodsCatBrandService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsCatBrandServiceImpl implements GoodsCatBrandService {
    @Autowired
    private GoodsCatBrandMapper goodsCatBrandMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodsCatBrandServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodsCatBrandMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoodsCatBrand selectByPrimaryKey(Integer id) {
        return this.goodsCatBrandMapper.selectByPrimaryKey(id);
    }

    public List<GoodsCatBrand> selectByParams(Criteria example) {
        return this.goodsCatBrandMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.goodsCatBrandMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(GoodsCatBrand record) {
        return this.goodsCatBrandMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoodsCatBrand record) {
        return this.goodsCatBrandMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodsCatBrandMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GoodsCatBrand record, Criteria example) {
        return this.goodsCatBrandMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GoodsCatBrand record, Criteria example) {
        return this.goodsCatBrandMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GoodsCatBrand record) {
        return this.goodsCatBrandMapper.insert(record);
    }

    public int insertSelective(GoodsCatBrand record) {
        return this.goodsCatBrandMapper.insertSelective(record);
    }
}