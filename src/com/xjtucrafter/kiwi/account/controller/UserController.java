package com.xjtucrafter.kiwi.account.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjtucrafter.kiwi.account.bean.User;
import com.xjtucrafter.kiwi.account.service.UserService;

@Controller
@RequestMapping("/users")
public class UserController {
	/*
	 * 用户注册 用postman验证
	 */
	@Autowired
	private UserService service;
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	@ResponseBody
	public boolean userReg(HttpServletRequest request){	
//		return true;
		System.out.println("--->here.......");
		String phone = request.getParameter("phone");
		System.out.println("-->phone = "+phone);
		String password = request.getParameter("password");
		User user = new User();
		user.setPhone(phone);
		user.setPassword(password);
		boolean flag = service.userReg(user);
		return flag;
	}
	/**
	 * 用户登录
	 * @param request
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public boolean userLogin(HttpServletRequest request){
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		User user = new User();
		user.setPhone(phone);
		user.setPassword(password);
		return service.userLogin(user);
	}

}
