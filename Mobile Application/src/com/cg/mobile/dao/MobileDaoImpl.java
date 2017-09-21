package com.cg.mobile.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.cg.mobile.DTO.PurchaseDetails;
import com.cg.mobile.dbutil.Mdbutil;
import com.cg.mobile.exception.MobileApplicationException;

public class MobileDaoImpl implements IMobileDAO {

	
	public int addPurchaseDetails(PurchaseDetails p) throws MobileApplicationException {
int result=0;
		Connection conn=null;
		try{
		conn=Mdbutil.getConnection();
		String insertQuery="Insert into purchasedetails values(purchase_seq_id.nextval,?,?,?,SYSDATE,?)";
		PreparedStatement ps=conn.prepareStatement(insertQuery);
		ps.setString(1,p.getCname());
		ps.setString(2,p.getMailid());
		ps.setLong(3,p.getPhoneno());
		String sql="select mobileId from mobiles where mobileid=?";
		PreparedStatement ps1=conn.prepareStatement(sql);
		ps1.setInt(1, p.getMobileId());
		ResultSet rs=ps1.executeQuery();
		while(rs.next()){
			ps.setInt(4,rs.getInt(1));
			result=ps.executeUpdate();
			System.out.println(result);
		
		}}
		
		catch(IOException a){
			a.printStackTrace();
		}
		catch(SQLException e){

			throw new MobileApplicationException(e.getMessage());
		}
		return result;
	}

}
