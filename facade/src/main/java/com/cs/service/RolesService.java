package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.Roles;
import java.util.List;

public interface RolesService {
    int countByParams(Criteria example);

    Roles selectByPrimaryKey(Integer roleid);

    List<Roles> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer roleid);

    int updateByPrimaryKeySelective(Roles record);

    int updateByPrimaryKey(Roles record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(Roles record, Criteria example);

    int updateByParams(Roles record, Criteria example);

    int insert(Roles record);

    int insertSelective(Roles record);
}