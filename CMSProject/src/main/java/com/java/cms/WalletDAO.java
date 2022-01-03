package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WalletDAO {

	Connection connection;
	PreparedStatement pst;
	
	public List<Wallet> showWallet() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from wallet";
		pst = connection.prepareStatement(cmd);
    	ResultSet rs = pst.executeQuery();
    	List<Wallet> walletList = new ArrayList<Wallet>();
    	Wallet wallet = null;
    	while(rs.next()) {	
    		wallet=new Wallet();
    		wallet.setWalletid(rs.getInt("walletid"));
    		wallet.setCustomerid(rs.getInt("customerid"));
    		wallet.setWallettype(rs.getString("wallettype"));
    		wallet.setAmount(rs.getInt("amount"));
    		walletList.add(wallet);
    	}
    	return walletList;
	}
	
	public Wallet searchWallet (int walletid)  throws ClassNotFoundException, SQLException {
		 connection = ConnectionHelper.getConnection();
			String cmd = "select * from wallet where walletid=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, walletid);
			Wallet wallet=null;
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				wallet=new Wallet();
	    		wallet.setWalletid(rs.getInt("walletid"));
	    		wallet.setCustomerid(rs.getInt("customerid"));
	    		wallet.setWallettype(rs.getString("wallettype"));
	    		wallet.setAmount(rs.getInt("amount"));	

	    	}
	    	return wallet;
}
}
