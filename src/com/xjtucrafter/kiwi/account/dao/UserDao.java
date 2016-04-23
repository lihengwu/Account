package com.xjtucrafter.kiwi.account.dao;

import com.xjtucrafter.kiwi.account.bean.User;

public interface UserDao {
	String userReg(User user);
	boolean userLogin(User user);
}
