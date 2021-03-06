package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VendorDAO {

	Connection connection;
	PreparedStatement pst;
	
	public List <Vendor> showVendor() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from vendor";
		pst = connection.prepareStatement(cmd);
    	ResultSet rs = pst.executeQuery();
    	List<Vendor> vendorList = new ArrayList<Vendor>();
    	Vendor vendor = null;
    	while(rs.next()) {	
    		vendor=new Vendor();
    		vendor.setVendorid(rs.getInt("vendorid"));
    		vendor.setVenname(rs.getString("venname"));
    		vendor.setVenstate(rs.getString("venstate"));
    		vendor.setVencity(rs.getString("vencity"));
    		vendor.setVenemail(rs.getString("venemail"));
    		vendor.setVenmobile(rs.getString("venmobile"));	
    		vendorList.add(vendor);
    	}
    	return vendorList;
	}
	public Vendor searchVendor (int vendorid)  throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
			String cmd = "select * from vendor where vendorid=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, vendorid);
			Vendor vendor=null;
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
	    		vendor=new Vendor();
	    		vendor.setVendorid(rs.getInt("vendorid"));
	    		vendor.setVenname(rs.getString("venname"));
	    		vendor.setVenstate(rs.getString("venstate"));
	    		vendor.setVencity(rs.getString("vencity"));
	    		vendor.setVenemail(rs.getString("venemail"));
	    		vendor.setVenmobile(rs.getString("venmobile"));	

	    	}
	    	return vendor;
}


}
