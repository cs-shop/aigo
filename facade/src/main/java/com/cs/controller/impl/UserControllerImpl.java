package com.cs.controller.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cs.controller.BaseController;
import com.cs.controller.UserController;
import com.cs.pojo.User;
import com.cs.service.UserService;


@Controller
@RequestMapping("/user")

public class UserControllerImpl extends BaseController  implements UserController{
	
	Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	@ResponseBody
	public String login(String userName,String password) {
		logger.info(userName);
//		User user = userService.selectByPrimaryKey(id);
		session.setAttribute("username", userName);

		return JSON.toJSONString("success");
	}
	
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	@ResponseBody
	public String register( User user) {
		logger.info("register");
		return JSON.toJSONString("success");
	}

}
