package com.cs.service.impl;

import com.cs.dao.GoodsPackageMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsPackage;
import com.cs.service.GoodsPackageService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsPackageServiceImpl implements GoodsPackageService {
    @Autowired
    private GoodsPackageMapper goodsPackageMapper;

    private static final Logger logger = LoggerFactory.getLogger(GoodsPackageServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.goodsPackageMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GoodsPackage selectByPrimaryKey(Integer id) {
        return this.goodsPackageMapper.selectByPrimaryKey(id);
    }

    public List<GoodsPackage> selectByParams(Criteria example) {
        return this.goodsPackageMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.goodsPackageMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(GoodsPackage record) {
        return this.goodsPackageMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GoodsPackage record) {
        return this.goodsPackageMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.goodsPackageMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GoodsPackage record, Criteria example) {
        return this.goodsPackageMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GoodsPackage record, Criteria example) {
        return this.goodsPackageMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GoodsPackage record) {
        return this.goodsPackageMapper.insert(record);
    }

    public int insertSelective(GoodsPackage record) {
        return this.goodsPackageMapper.insertSelective(record);
    }
}