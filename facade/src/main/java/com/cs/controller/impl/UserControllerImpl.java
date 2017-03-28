package com.cs.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.controller.UserController;


@Controller
@RequestMapping("/user")
public class UserControllerImpl  implements UserController{
	@RequestMapping("getUsers")
	@ResponseBody
	public String login() {
		System.out.println("fff");
		// TODO Auto-generated method stub
		
		return "";
	}

}
