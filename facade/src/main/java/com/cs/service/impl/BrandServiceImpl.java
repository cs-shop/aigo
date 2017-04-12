package com.cs.service.impl;

import com.cs.dao.BrandMapper;
import com.cs.pojo.Brand;
import com.cs.pojo.Criteria;
import com.cs.service.BrandService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService {
    @Autowired
    private BrandMapper brandMapper;

    private static final Logger logger = LoggerFactory.getLogger(BrandServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.brandMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Brand selectByPrimaryKey(Integer brandid) {
        return this.brandMapper.selectByPrimaryKey(brandid);
    }

    public List<Brand> selectByParams(Criteria example) {
        return this.brandMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer brandid) {
        return this.brandMapper.deleteByPrimaryKey(brandid);
    }

    public int updateByPrimaryKeySelective(Brand record) {
        return this.brandMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Brand record) {
        return this.brandMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.brandMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Brand record, Criteria example) {
        return this.brandMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Brand record, Criteria example) {
        return this.brandMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Brand record) {
        return this.brandMapper.insert(record);
    }

    public int insertSelective(Brand record) {
        return this.brandMapper.insertSelective(record);
    }
}