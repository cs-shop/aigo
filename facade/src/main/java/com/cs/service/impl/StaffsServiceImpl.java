package com.cs.service.impl;

import com.cs.dao.StaffsMapper;
import com.cs.pojo.Criteria;
import com.cs.pojo.Staffs;
import com.cs.service.StaffsService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffsServiceImpl implements StaffsService {
    @Autowired
    private StaffsMapper staffsMapper;

    private static final Logger logger = LoggerFactory.getLogger(StaffsServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.staffsMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Staffs selectByPrimaryKey(Integer staffid) {
        return this.staffsMapper.selectByPrimaryKey(staffid);
    }

    public List<Staffs> selectByParams(Criteria example) {
        return this.staffsMapper.selectByParams(example);
    }

    public int deleteByPrimaryKey(Integer staffid) {
        return this.staffsMapper.deleteByPrimaryKey(staffid);
    }

    public int updateByPrimaryKeySelective(Staffs record) {
        return this.staffsMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(Staffs record) {
        return this.staffsMapper.updateByPrimaryKey(record);
    }

    public int deleteByParams(Criteria example) {
        return this.staffsMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Staffs record, Criteria example) {
        return this.staffsMapper.updateByParamsSelective(record, example.getCondition());
    }

    public int updateByParams(Staffs record, Criteria example) {
        return this.staffsMapper.updateByParams(record, example.getCondition());
    }

    public int insert(Staffs record) {
        return this.staffsMapper.insert(record);
    }

    public int insertSelective(Staffs record) {
        return this.staffsMapper.insertSelective(record);
    }
}