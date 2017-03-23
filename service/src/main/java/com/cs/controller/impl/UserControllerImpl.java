package com.cs.controller.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cs.controller.UserController;
import com.cs.pojo.User;

@Controller
public class UserControllerImpl implements UserController {
	public boolean login() {
		System.out.println("fff");
		// TODO Auto-generated method stub
		
		return false;
	}

}
