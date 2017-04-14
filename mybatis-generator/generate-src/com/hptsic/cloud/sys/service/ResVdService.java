package com.hptsic.cloud.sys.service;

import com.hptsic.cloud.sys.pojo.Criteria;
import com.hptsic.cloud.sys.pojo.ResVd;
import java.util.List;

public interface ResVdService {
    int countByParams(Criteria example);

    ResVd selectByPrimaryKey(String resVdSid);

    List<ResVd> selectByParams(Criteria example);

    int deleteByPrimaryKey(String resVdSid);

    int updateByPrimaryKeySelective(ResVd record);

    int updateByPrimaryKey(ResVd record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ResVd record, Criteria example);

    int updateByParams(ResVd record, Criteria example);

    int insert(ResVd record);

    int insertSelective(ResVd record);
}