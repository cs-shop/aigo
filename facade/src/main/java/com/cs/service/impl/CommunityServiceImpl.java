package com.cs.service.impl;

import com.cs.dao.CommunityMapper;
import com.cs.pojo.Community;
import com.cs.pojo.Criteria;
import com.cs.service.CommunityService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private CommunityMapper communityMapper;

    private static final Logger logger = LoggerFactory.getLogger(CommunityServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.communityMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Community selectByPrimaryKey(Integer communityid) {
        return this.communityMapper.selectByPrimaryKey(communityid);
    }

    public List<Community> selectByParams(Criteria example) {
        return this.communityMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer communityid) {
        return this.communityMapper.deleteByPrimaryKey(communityid);
    }

    public int updateByPrimaryKeySelective(Community record) {
        return this.communityMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Community record) {
        return this.communityMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.communityMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Community record, Criteria example) {
        return this.communityMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Community record, Criteria example) {
        return this.communityMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Community record) {
        return this.communityMapper.insert(record);
    }

    public int insertSelective(Community record) {
        return this.communityMapper.insertSelective(record);
    }
}