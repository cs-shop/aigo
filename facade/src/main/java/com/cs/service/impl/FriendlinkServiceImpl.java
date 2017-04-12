package com.cs.service.impl;

import com.cs.dao.FriendlinkMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Friendlink;
import com.cs.service.FriendlinkService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendlinkServiceImpl implements FriendlinkService {
    @Autowired
    private FriendlinkMapper friendlinkMapper;

    private static final Logger logger = LoggerFactory.getLogger(FriendlinkServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.friendlinkMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Friendlink selectByPrimaryKey(Integer friendlinkid) {
        return this.friendlinkMapper.selectByPrimaryKey(friendlinkid);
    }

    public List<Friendlink> selectByParams(Criteria example) {
        return this.friendlinkMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer friendlinkid) {
        return this.friendlinkMapper.deleteByPrimaryKey(friendlinkid);
    }

    public int updateByPrimaryKeySelective(Friendlink record) {
        return this.friendlinkMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Friendlink record) {
        return this.friendlinkMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.friendlinkMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Friendlink record, Criteria example) {
        return this.friendlinkMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Friendlink record, Criteria example) {
        return this.friendlinkMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Friendlink record) {
        return this.friendlinkMapper.insert(record);
    }

    public int insertSelective(Friendlink record) {
        return this.friendlinkMapper.insertSelective(record);
    }
}