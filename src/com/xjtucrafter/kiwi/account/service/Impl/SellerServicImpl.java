package com.xjtucrafter.kiwi.account.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.xjtucrafter.kiwi.account.bean.Seller;
import com.xjtucrafter.kiwi.account.dao.SellerDao;
import com.xjtucrafter.kiwi.account.service.SellerService;

@Service("sellerService")

public class SellerServicImpl implements SellerService{
	@Autowired
	private SellerDao sellerDao;
	@Override
	@Transactional
	public boolean sellerReg(Seller seller) {
		// TODO Auto-generated method stub
		String phone = sellerDao.sellerReg(seller);
		if(phone != null)
			return true;
		else
			return false;
		
	}

	@Override
	public boolean sellerLogin(Seller seller) {
		// TODO Auto-generated method stub
		return sellerDao.sellerLogin(seller);
	}

}
