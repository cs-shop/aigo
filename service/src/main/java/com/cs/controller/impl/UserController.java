package com.cs.controller.impl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.common.json.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cs.pojo.User;

@Controller
@RequestMapping("/user")
public class UserController implements com.cs.controller.UserController{

	@RequestMapping("/showUsers")
	@ResponseBody
	public String toIndex(HttpServletRequest request, Model model) {
		return "showUser";
	}
	@RequestMapping("/getUser")
	@ResponseBody
	public String getUser(){
		User user = new User();
		user.setName("llf");
		return "(" +com.alibaba.fastjson.JSON.toJSONString(user)+")";
	}
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}
	
}
