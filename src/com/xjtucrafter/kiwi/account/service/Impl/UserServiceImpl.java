package com.xjtucrafter.kiwi.account.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjtucrafter.kiwi.account.bean.User;
import com.xjtucrafter.kiwi.account.dao.UserDao;
import com.xjtucrafter.kiwi.account.service.UserService;
@Service("userService")
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Override
	@Transactional
	public boolean userReg(User user) {
		// TODO Auto-generated method stub
		String result = userDao.userReg(user);
		if(result != null)
			return true;
		else
		return false;
	}
	@Override
	public boolean userLogin(User user) {
		// TODO Auto-generated method stub
		
		return userDao.userLogin(user);
	}

}
