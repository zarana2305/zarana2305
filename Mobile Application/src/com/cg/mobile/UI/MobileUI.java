package com.cg.mobile.UI;
import java.util.Scanner;

import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.exception.MobileApplicationException;
import com.cg.mobile.service.IMobileService;
import com.cg.mobile.service.MobileServiceImpl;

public class MobileUI {
	static PurchaseDetails details=null;
	static IMobileService service=null;
	//static Scanner sc=null;
public static void main(String[] args) throws MobileApplicationException
	{
		Scanner sc=new Scanner(System.in);
		 
		
System.out.println("mobile application\n*********");
System.out.println("1.Enter purchase details");
System.out.println("2.get mobile details");
System.out.println("3.Exit");
System.out.println("enter your choice");
int choice=sc.nextInt();
while(true){
	switch(choice){
	case 1:addPurchaseDetails();
	break;
	case 2:getMobileDetails();
	break;
	case 3:System.exit(0);
	break;
	
	
	}
}
}

	private static void getMobileDetails() {}

	private static void addPurchaseDetails() throws MobileApplicationException {
		try{
			service= new MobileServiceImpl();
			Scanner a=new Scanner(System.in);
			System.out.println("Enter your name : ");
			String cname=a.next();
				if(service.validateName(cname))
					{
						System.out.println("Enter your mailId : ");
						String mailid=a.next();
				if(service.validateEmail(mailid))
					{
						System.out.println("Enter your phone no : ");
						long phoneno=a.nextLong();
						String num=String.valueOf(phoneno);
				if(service.validatephone(num))
					{
						System.out.println("Enter your mobile ID : ");
						int mobileId=a.nextInt();
						details=new PurchaseDetails(cname,mailid,phoneno,mobileId);
						service=new MobileServiceImpl();
						int res=service.addPurchaseDetails(details);
						System.out.println(res+"inserted");
				if(res==1)
					{
						System.out.println("value added in database");
					}
				else{System.out.println("value not added");}
					}
					}
					}
					}	
		catch(MobileApplicationException e)
		{throw new MobileApplicationException("Exception occured");}
	
	}	
}
	
