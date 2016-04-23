package com.xjtucrafter.kiwi.account.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xjtucrafter.kiwi.account.bean.User;
import com.xjtucrafter.kiwi.account.dao.UserDao;
@Repository("userDao")
public class UserDaoImpl implements UserDao{
	@PersistenceContext(name="unitName")
	@Autowired
	private EntityManager entityManager;
	@Override
	public String userReg(User user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
		return user.getPhone();
	}

	@Override
	public boolean userLogin(User user) throws NoResultException{
		// TODO Auto-generated method stub
		String phone = user.getPhone();
		String password = user.getPassword();
		String jpql = "select user from User user where user.phone=:phone";
		User userTmp =(User)entityManager.createQuery(jpql).setParameter("phone", phone).getSingleResult();
		if(password.equals(userTmp.getPassword()))
			return true;
		else
			return false;
	}

}
