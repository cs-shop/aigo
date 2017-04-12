package com.cs.service.impl;

import com.cs.dao.PackagesMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Packages;
import com.cs.service.PackagesService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PackagesServiceImpl implements PackagesService {
    @Autowired
    private PackagesMapper packagesMapper;

    private static final Logger logger = LoggerFactory.getLogger(PackagesServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.packagesMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Packages selectByPrimaryKey(Integer packageid) {
        return this.packagesMapper.selectByPrimaryKey(packageid);
    }

    public List<Packages> selectByParams(Criteria example) {
        return this.packagesMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer packageid) {
        return this.packagesMapper.deleteByPrimaryKey(packageid);
    }

    public int updateByPrimaryKeySelective(Packages record) {
        return this.packagesMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Packages record) {
        return this.packagesMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.packagesMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Packages record, Criteria example) {
        return this.packagesMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Packages record, Criteria example) {
        return this.packagesMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Packages record) {
        return this.packagesMapper.insert(record);
    }

    public int insertSelective(Packages record) {
        return this.packagesMapper.insertSelective(record);
    }
}