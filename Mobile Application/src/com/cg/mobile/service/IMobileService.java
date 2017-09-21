package com.cg.mobile.service;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationException;

public interface IMobileService {
public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException;
public boolean validateName(String name);
public boolean validateEmail(String ename);
public boolean validatephone(String phoneno);
}
