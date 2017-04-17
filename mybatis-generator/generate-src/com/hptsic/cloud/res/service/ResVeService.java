package com.hptsic.cloud.res.service;

import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResVe;
import java.util.List;

public interface ResVeService {
    int countByParams(Criteria example);

    ResVe selectByPrimaryKey(String resVeSid);

    List<ResVe> selectByParams(Criteria example);

    int deleteByPrimaryKey(String resVeSid);

    int updateByPrimaryKeySelective(ResVe record);

    int updateByPrimaryKey(ResVe record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ResVe record, Criteria example);

    int updateByParams(ResVe record, Criteria example);

    int insert(ResVe record);

    int insertSelective(ResVe record);
}