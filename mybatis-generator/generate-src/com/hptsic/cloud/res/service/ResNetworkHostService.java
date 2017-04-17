package com.hptsic.cloud.res.service;

import com.hptsic.cloud.res.pojo.Criteria;
import com.hptsic.cloud.res.pojo.ResNetworkHost;
import java.util.List;

public interface ResNetworkHostService {
    int countByParams(Criteria example);

    ResNetworkHost selectByPrimaryKey(ResNetworkHostKey key);

    List<ResNetworkHost> selectByParams(Criteria example);

    int deleteByPrimaryKey(ResNetworkHostKey key);

    int updateByPrimaryKeySelective(ResNetworkHost record);

    int updateByPrimaryKey(ResNetworkHost record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(ResNetworkHost record, Criteria example);

    int updateByParams(ResNetworkHost record, Criteria example);

    int insert(ResNetworkHost record);

    int insertSelective(ResNetworkHost record);
}