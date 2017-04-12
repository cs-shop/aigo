package com.cs.service.impl;

import com.cs.dao.RolesMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Roles;
import com.cs.service.RolesService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolesServiceImpl implements RolesService {
    @Autowired
    private RolesMapper rolesMapper;

    private static final Logger logger = LoggerFactory.getLogger(RolesServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.rolesMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Roles selectByPrimaryKey(Integer roleid) {
        return this.rolesMapper.selectByPrimaryKey(roleid);
    }

    public List<Roles> selectByParams(Criteria example) {
        return this.rolesMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer roleid) {
        return this.rolesMapper.deleteByPrimaryKey(roleid);
    }

    public int updateByPrimaryKeySelective(Roles record) {
        return this.rolesMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Roles record) {
        return this.rolesMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.rolesMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Roles record, Criteria example) {
        return this.rolesMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Roles record, Criteria example) {
        return this.rolesMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Roles record) {
        return this.rolesMapper.insert(record);
    }

    public int insertSelective(Roles record) {
        return this.rolesMapper.insertSelective(record);
    }
}