package com.cs.service;

import com.cs.pojo.Criteria;
import com.cs.pojo.GoodsCat;
import java.util.List;

public interface GoodsCatService {
    int countByParams(Criteria example);

    GoodsCat selectByPrimaryKey(Integer catid);

    List<GoodsCat> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer catid);

    int updateByPrimaryKeySelective(GoodsCat record);

    int updateByPrimaryKey(GoodsCat record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(GoodsCat record, Criteria example);

    int updateByParams(GoodsCat record, Criteria example);

    int insert(GoodsCat record);

    int insertSelective(GoodsCat record);
}