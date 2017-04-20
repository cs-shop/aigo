package com.cs.controller.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cs.controller.BaseController;
import com.cs.controller.GoodController;
import com.cs.pojo.Criteria;
import com.cs.pojo.Good;
import com.cs.service.GoodService;

@Controller
@RequestMapping("/good")
public class GoodControllerImpl extends BaseController implements GoodController{

	@Autowired
	private GoodService goodService;
	
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

	
}
