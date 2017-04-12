package com.cs.service;

import com.cs.pojo.CouponsUser;
import com.cs.pojo.Criteria;
import java.util.List;

public interface CouponsUserService {
    int countByParams(Criteria example);

    CouponsUser selectByPrimaryKey(Integer id);

    List<CouponsUser> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CouponsUser record);

    int updateByPrimaryKey(CouponsUser record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(CouponsUser record, Criteria example);

    int updateByParams(CouponsUser record, Criteria example);

    int insert(CouponsUser record);

    int insertSelective(CouponsUser record);
}