package com.xjtucrafter.kiwi.account.dao;

import com.xjtucrafter.kiwi.account.bean.Seller;

public interface SellerDao {
	String sellerReg(Seller seller);
	boolean sellerLogin(Seller seller);
}
