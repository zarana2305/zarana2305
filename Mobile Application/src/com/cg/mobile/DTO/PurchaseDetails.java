package com.cg.mobile.DTO;
import java.time.LocalDate;
public class PurchaseDetails {
public PurchaseDetails() {
		
	}
public PurchaseDetails(String cname, String mailid, long phoneno,
		int mobileId) 
{
	super();
	this.cname = cname;
	this.mailid = mailid;
	this.phoneno = phoneno;
	this.mobileId = mobileId;
	}
private int purchaseid;
private String cname;
private String mailid;
private long phoneno;
private LocalDate purchasedate;
private int mobileId;
@Override
public String toString() {
	return "PurchaseDetails [purchaseid=" + purchaseid + ", cname=" + cname
			+ ", mailid=" + mailid + ", phoneno=" + phoneno + ", purchasedate="
			+ purchasedate + ", mobileId=" + mobileId + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()="
			+ super.toString() + "]";
}
public int getPurchaseid() {
	return purchaseid;
}
public void setPurchaseid(int purchaseid) {
	this.purchaseid = purchaseid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getMailid() {
	return mailid;
}
public void setMailid(String mailid) {
	this.mailid = mailid;
}
public long getPhoneno() {
	return phoneno;
}
public void setPhoneno(long phoneno) {
	this.phoneno = phoneno;
}
public LocalDate getPurchasedate() {
	return purchasedate;
}
public void setPurchasedate(LocalDate purchasedate) {
	this.purchasedate = purchasedate;
}
public int getMobileId() {
	return mobileId;
}
public void setMobileId(int mobileId) {
	this.mobileId = mobileId;
}


}
