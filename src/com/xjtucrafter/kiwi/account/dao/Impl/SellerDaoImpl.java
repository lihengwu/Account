package com.xjtucrafter.kiwi.account.dao.Impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.xjtucrafter.kiwi.account.bean.Seller;
import com.xjtucrafter.kiwi.account.dao.SellerDao;



@Repository("sellerDao")
public class SellerDaoImpl implements SellerDao{
	@PersistenceContext(name="unitName")
	@Autowired
	EntityManager entityManager;
	
	@Override
	public String sellerReg(Seller seller) {
		// TODO Auto-generated method stub
		entityManager.persist(seller);
		return seller.getPhone();
	}

	@Override
	public boolean sellerLogin(Seller seller) throws NoResultException {
		// TODO Auto-generated method stub
		String phone = seller.getPhone();
		String password = seller.getPassword();
		String jpql = "select seller from Seller seller where seller.phone=:phone";
		Seller userTmp =(Seller)entityManager.createQuery(jpql).setParameter("phone", phone).getSingleResult();
		if(password.equals(userTmp.getPassword()))
			return true;
		else
			return false;
		
	}

}
