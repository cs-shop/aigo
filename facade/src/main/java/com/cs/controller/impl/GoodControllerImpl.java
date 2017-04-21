package com.cs.controller.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cs.controller.BaseController;
import com.cs.controller.GoodController;
import com.cs.pojo.Criteria;
import com.cs.pojo.Good;
import com.cs.pojo.GoodsCat;
import com.cs.service.GoodService;
import com.cs.service.GoodsCatService;

@Controller
@RequestMapping("/good")
public class GoodControllerImpl extends BaseController implements GoodController{

	@Autowired
	private GoodService goodService;
	
	@Autowired
	private GoodsCatService goodsCatService;
	
	@Override
	@ResponseBody
	@RequestMapping(value="/list",method=RequestMethod.GET)
	public List<Good> getGoodsByParams() {
		int total = 10;
		int rows = 2;
		Criteria criteria = new Criteria();
		Map parameterMap = request.getParameterMap();
		String[] goodName = (String[]) parameterMap.get("good_name");
		if(goodName != null) {
			criteria.put("goodsname", goodName[0]);
		}
		List<Good> goodList = goodService.selectByParams(criteria);
		String returnJson = "{\"total\":" + total + ",\"rows\":" + JSON.toJSONString(goodList) + "}";
		return  goodList;
//		return returnJson;
	}

	@RequestMapping(value="/cats",method=RequestMethod.GET)
	@ResponseBody
	@Override
	public List<JSONObject> getGoodsCat() {
		
		Criteria example = new Criteria();
		example.put("parentid", 0);
		
		List<JSONObject> list =  new ArrayList<JSONObject>();
		List<GoodsCat> goodsCat = goodsCatService.selectByParams(example);
		if (!CollectionUtils.isEmpty(goodsCat)) {
			for (GoodsCat cat : goodsCat) {
				JSONObject object = new JSONObject();
				object.put("url", "http://test");
				object.put("name", cat.getCatname());
				list.add(object);
			}
		}
		return list;
	}

	
}
