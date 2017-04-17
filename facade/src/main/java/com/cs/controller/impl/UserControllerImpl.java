package com.cs.controller.impl;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.cs.common.Constants;
import com.cs.common.EncryptUtil;
import com.cs.controller.BaseController;
import com.cs.controller.UserController;
import com.cs.pojo.Criteria;
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
		Criteria criteria = new Criteria();
		criteria.put("loginName", userName);
		try {
			criteria.put("loginPwd", EncryptUtil.encryptMD5(password));
		} catch (Exception e) {
			e.printStackTrace();
		}
		List<User> users = userService.selectByParams(criteria);
		if(CollectionUtils.isEmpty(users)) {
			response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
			return JSON.toJSONString("用户名或者密码错误!");
		}
		session.setAttribute(Constants.SESSION_USER_NAME, userName);

		return JSON.toJSONString("success");
	}
	
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	@ResponseBody
	public String register(User user) {
		logger.info("register");
		try {
			user.setLoginPwd(EncryptUtil.encryptMD5(user.getLoginPwd()));
			userService.insertSelective(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		session.setAttribute(Constants.SESSION_USER_NAME, user.getLoginName());
		return JSON.toJSONString("success");
	}

}
