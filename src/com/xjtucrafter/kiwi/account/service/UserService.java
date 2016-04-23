package com.xjtucrafter.kiwi.account.service;

import com.xjtucrafter.kiwi.account.bean.User;

public interface UserService {
	public boolean userReg(User user);

	public boolean userLogin(User user);

}
