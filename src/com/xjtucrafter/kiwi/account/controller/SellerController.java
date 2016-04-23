package com.xjtucrafter.kiwi.account.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xjtucrafter.kiwi.account.bean.Seller;
import com.xjtucrafter.kiwi.account.service.SellerService;

@Controller
@RequestMapping("/merchant")
public class SellerController {
	@Autowired
	private SellerService sellerService;
	
	@RequestMapping(value="/reg", method=RequestMethod.POST)
	@ResponseBody
	public boolean sellerReg(HttpServletRequest request){
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		Seller seller = new Seller();
		seller.setPassword(password);
		seller.setPhone(phone);
		return sellerService.sellerReg(seller);		
	}
	
	@RequestMapping(value="/login", method= RequestMethod.POST)
	@ResponseBody
	public boolean sellerLogin(HttpServletRequest request){
		String phone = request.getParameter("phone");
		String password = request.getParameter("password");
		Seller seller = new Seller();
		seller.setPassword(password);
		seller.setPhone(phone);
		return sellerService.sellerLogin(seller);
	}
	
}
