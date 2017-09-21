package com.cg.mobile.service;

import java.util.regex.Pattern;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dao.IMobileDAO;
import com.cg.mobile.dao.MobileDaoImpl;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileServiceImpl implements IMobileService{

	IMobileDAO dao=null;
	
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException {
		dao=new MobileDaoImpl();
		return dao.addPurchaseDetails(p);
	}
	
	public boolean validateName(String name){
		String ptn="[a-zA-Z]{1}[a-z]{2,20}";
		if(Pattern.matches(ptn,name)){
			return true;
		}
		else{
			System.out.println("Please enter valid data");
			return false;
		}
		
	}

	
	public boolean validateEmail(String ename){
		String ptn_email="^[?=.*A-Za-z0-9]+@[A-Za-z]+\\.[A-Za-z]{2,6}$";
		if(Pattern.matches(ptn_email,ename)){
			return true;
		}
		else{
			System.out.println("Please enter valid Email_id");
			return false;
		}
		
	}
	
	public boolean validatephone(String phoneno){
		String ptn_phone="[0-9]{10}";
		if(Pattern.matches(ptn_phone,phoneno)){
			return true;
		}
		else{
			System.out.println("Please enter valid phone number");
			return false;
		}
		
	}

	

	
	

	
	
}
