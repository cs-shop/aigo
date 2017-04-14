package com.cs.controller;

import com.cs.pojo.User;


public interface UserController {

	String login(String userName, String password);
	
	public String register(User user);
}
