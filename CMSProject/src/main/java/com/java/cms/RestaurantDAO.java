package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.cms.ConnectionHelper;
import com.java.cms.Restaurant;

public class RestaurantDAO {

	Connection connection;
	PreparedStatement pst;
	
	public Restaurant searchRestaurant(int resid) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from RestaurantDetails where resid=? ";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, resid);
		ResultSet rs = pst.executeQuery();
		Restaurant restaurant = null;
		if (rs.next()) {
			restaurant = new Restaurant();
			restaurant.setResid(rs.getInt("resid"));
			restaurant.setResname(rs.getString("resname"));
			restaurant.setRescity(rs.getString("rescity"));
			restaurant.setResbranch(rs.getString("resbranch"));
			restaurant.setResemail(rs.getString("resemail"));
			restaurant.setResmobile(rs.getString("resmobile"));
		}
		return restaurant;
	}
	
	public List<Restaurant> showRestaurant() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from RestaurantDetails";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Restaurant> restaurantList = new ArrayList<Restaurant>();
		Restaurant restaurant = null; 
		while(rs.next()) {
			restaurant = new Restaurant();
			restaurant.setResid(rs.getInt("resid"));
			restaurant.setResname(rs.getString("resname"));
			restaurant.setRescity(rs.getString("rescity"));
			restaurant.setResbranch(rs.getString("resbranch"));
			restaurant.setResemail(rs.getString("resemail"));
			restaurant.setResmobile(rs.getString("resmobile"));
			restaurantList.add(restaurant);
		}
		return restaurantList;
	}
}
