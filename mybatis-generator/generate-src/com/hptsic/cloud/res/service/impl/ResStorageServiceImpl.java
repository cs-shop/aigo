package com.hptsic.cloud.res.service.impl;

import com.hptsic.cloud.res.dao.ResStorageMapper;
import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResStorage;
import com.hptsic.cloud.res.service.ResStorageService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResStorageServiceImpl implements ResStorageService {
    @Autowired
    private ResStorageMapper resStorageMapper;

    private static final Logger logger = LoggerFactory.getLogger(ResStorageServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.resStorageMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public ResStorage selectByPrimaryKey(String resStorageSid) {
        return this.resStorageMapper.selectByPrimaryKey(resStorageSid);
    }

    public List<ResStorage> selectByParams(Criteria example) {
        return this.resStorageMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(String resStorageSid) {
        return this.resStorageMapper.deleteByPrimaryKey(resStorageSid);
    }

    public int updateByPrimaryKeySelective(ResStorage record) {
        return this.resStorageMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ResStorage record) {
        return this.resStorageMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.resStorageMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(ResStorage record, Criteria example) {
        return this.resStorageMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(ResStorage record, Criteria example) {
        return this.resStorageMapper.updateByParams(record, example.getCondition());
    }

    public int insert(ResStorage record) {
        return this.resStorageMapper.insert(record);
    }

    public int insertSelective(ResStorage record) {
        return this.resStorageMapper.insertSelective(record);
    }
}