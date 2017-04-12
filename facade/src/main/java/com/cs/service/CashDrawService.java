package com.cs.service;

import com.cs.pojo.CashDraw;
import com.cs.pojo.Criteria;
import java.util.List;

public interface CashDrawService {
    int countByParams(Criteria example);

    CashDraw selectByPrimaryKey(Integer cashid);

    List<CashDraw> selectByParams(Criteria example);

    int deleteByPrimaryKey(Integer cashid);

    int updateByPrimaryKeySelective(CashDraw record);

    int updateByPrimaryKey(CashDraw record);

    int deleteByParams(Criteria example);

    int updateByParamsSelective(CashDraw record, Criteria example);

    int updateByParams(CashDraw record, Criteria example);

    int insert(CashDraw record);

    int insertSelective(CashDraw record);
}