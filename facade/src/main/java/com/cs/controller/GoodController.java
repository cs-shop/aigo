package com.cs.controller;

import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.cs.pojo.Good;



public interface GoodController {
	
	public List<Good> getGoodsByParams();
	
	public List<JSONObject> getGoodsCat();
	
}
