package com.cs.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.cs.controller.UserController;
import com.cs.pojo.User;
import com.cs.service.UserService;


@Controller
@RequestMapping("/user")
@Service(interfaceClass=UserController.class, protocol = {"rest", "dubbo"})
public class UserControllerImpl  implements UserController{
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("getUsers")
	@ResponseBody
	public String login() {
		User user = userService.selectByPrimaryKey(100);
		System.out.println("fff");
		return JSON.toJSONString(user);
	}

}
