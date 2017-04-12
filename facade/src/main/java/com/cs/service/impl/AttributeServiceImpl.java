package com.cs.service.impl;

import com.cs.dao.AttributeMapper;
import com.cs.pojo.Attribute;
import com.cs.pojo.Criteria;
import com.cs.service.AttributeService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttributeServiceImpl implements AttributeService {
    @Autowired
    private AttributeMapper attributeMapper;

    private static final Logger logger = LoggerFactory.getLogger(AttributeServiceImpl.class);

    public int countByParams(Criteria example) {
        int count = this.attributeMapper.countByParams(example);
        logger.debug("count: {}", count);
        return count;
    }

    public Attribute selectByPrimaryKey(Integer attrid) {
        return this.attributeMapper.selectByPrimaryKey(attrid);
    }


    public int deleteByPrimaryKey(Integer attrid) {
        return this.attributeMapper.deleteByPrimaryKey(attrid);
    }

    public int updateByPrimaryKeySelective(Attribute record) {
        return this.attributeMapper.updateByPrimaryKeySelective(record);
    }


    public int deleteByParams(Criteria example) {
        return this.attributeMapper.deleteByParams(example);
    }

    public int updateByParamsSelective(Attribute record, Criteria example) {
        return this.attributeMapper.updateByParamsSelective(record, example.getCondition());
    }


    public int insert(Attribute record) {
        return this.attributeMapper.insert(record);
    }

    public int insertSelective(Attribute record) {
        return this.attributeMapper.insertSelective(record);
    }

	@Override
	public List<Attribute> selectByParams(Criteria example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKey(Attribute record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByParams(Attribute record, Criteria example) {
		// TODO Auto-generated method stub
		return 0;
	}
}