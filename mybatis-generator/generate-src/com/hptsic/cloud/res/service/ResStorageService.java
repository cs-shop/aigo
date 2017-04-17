package com.hptsic.cloud.res.service;

import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResStorage;
import java.util.List;

public interface ResStorageService {
    int countByParams(Criteria example);

    ResStorage selectByPrimaryKey(String resStorageSid);

    List<ResStorage> selectByParams(Criteria example);

    int deleteByPrimaryKey(String resStorageSid);

    int updateByPrimaryKeySelective(ResStorage record);

    int updateByPrimaryKey(ResStorage record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ResStorage record, Criteria example);

    int updateByParams(ResStorage record, Criteria example);

    int insert(ResStorage record);

    int insertSelective(ResStorage record);
}