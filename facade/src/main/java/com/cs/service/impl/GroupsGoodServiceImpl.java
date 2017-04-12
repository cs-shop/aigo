package com.cs.service.impl;

import com.cs.dao.GroupsGoodMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.GroupsGood;
import com.cs.service.GroupsGoodService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupsGoodServiceImpl implements GroupsGoodService {
    @Autowired
    private GroupsGoodMapper groupsGoodMapper;

    private static final Logger logger = LoggerFactory.getLogger(GroupsGoodServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.groupsGoodMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public GroupsGood selectByPrimaryKey(Integer id) {
        return this.groupsGoodMapper.selectByPrimaryKey(id);
    }

    public List<GroupsGood> selectByParams(Criteria example) {
        return this.groupsGoodMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer id) {
        return this.groupsGoodMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKeySelective(GroupsGood record) {
        return this.groupsGoodMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(GroupsGood record) {
        return this.groupsGoodMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.groupsGoodMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(GroupsGood record, Criteria example) {
        return this.groupsGoodMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(GroupsGood record, Criteria example) {
        return this.groupsGoodMapper.updateByParams(record, example.getCondition());
    }

    public int insert(GroupsGood record) {
        return this.groupsGoodMapper.insert(record);
    }

    public int insertSelective(GroupsGood record) {
        return this.groupsGoodMapper.insertSelective(record);
    }
}