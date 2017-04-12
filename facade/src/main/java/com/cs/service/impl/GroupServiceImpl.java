package com.cs.service.impl;

import com.cs.dao.GroupMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Group;
import com.cs.service.GroupService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupMapper groupMapper;

    private static final Logger logger = LoggerFactory.getLogger(GroupServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.groupMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Group selectByPrimaryKey(Integer groupid) {
        return this.groupMapper.selectByPrimaryKey(groupid);
    }

    public List<Group> selectByParams(Criteria example) {
        return this.groupMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer groupid) {
        return this.groupMapper.deleteByPrimaryKey(groupid);
    }

    public int updateByPrimaryKeySelective(Group record) {
        return this.groupMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Group record) {
        return this.groupMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.groupMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Group record, Criteria example) {
        return this.groupMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Group record, Criteria example) {
        return this.groupMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Group record) {
        return this.groupMapper.insert(record);
    }

    public int insertSelective(Group record) {
        return this.groupMapper.insertSelective(record);
    }
}