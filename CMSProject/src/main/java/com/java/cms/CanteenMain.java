package com.java.cms;

import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class CanteenMain {

	static Scanner sc = new Scanner(System.in);
	static RestaurantDAO dao = new RestaurantDAO();
	static MenuDAO dao1 = new MenuDAO();
	static CustomerDAO dao2 = new CustomerDAO();
	static VendorDAO dao3 = new VendorDAO();
	static WalletDAO dao4 = new WalletDAO();
	
	public static void showRestaurant() {
		List<Restaurant> rest = null;
		try {
			rest = dao.showRestaurant();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Restaurant ld : rest) {
			System.out.println(ld);
		}
	}
	
	public static void searchRestaurant() {
		int restaurantID;
		System.out.println("Enter restaurant Id  ");
		restaurantID = sc.nextInt();
		Restaurant rest = null;
		try {
			rest = dao.searchRestaurant(restaurantID);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rest!=null) {
			System.out.println(rest);
		} else {
			System.out.println("*** Record Not Found ***");
		}
		}
	
	public static void showMenu() {
		List<Menu> menu = null;
		try {
			menu = dao1.showMenu();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Menu id : menu) {
			System.out.println(id);
		}
	}
	

	public static void searchMenu() {
	int menuid;
	System.out.println("Enter menu Id  ");
	menuid = sc.nextInt();
	Menu menu = null;
	try {
		menu = dao1.searchMenu(menuid);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (menu!=null) {
		System.out.println(menu);
	} else {
		System.out.println("*** Record Not Found ***");
	}
	}
	
	public static void showCustomer() {
		List<Customer> customer = null;
		try {
			customer = dao2.showCustomer();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Customer id : customer) {
			System.out.println(id);
		}
	}
	
	public static void searchCustomer() {
	int customerid;
	System.out.println("Enter customer Id  ");
	customerid = sc.nextInt();
	Customer customer = null;
	try {
		customer = dao2.searchCustomer(customerid);
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if (customer!=null) {
		System.out.println(customer);
	} else {
		System.out.println("*** Record Not Found ***");
	}
	}
	
	public static void showVendor() {
		List<Vendor> vendor = null;
		try {
			vendor = dao3.showVendor();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Vendor id : vendor) {
			System.out.println(id);
		}
	}
	public static void searchVendor() {
		int vendorid;
		System.out.println("Enter vendor Id  ");
		vendorid = sc.nextInt();
		Vendor vendor = null;
		try {
			vendor = dao3.searchVendor(vendorid);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (vendor!=null) {
			System.out.println(vendor);
		} else {
			System.out.println("*** Record Not Found ***");
		}
		}

	public static void showWallet() {
		List<Wallet> wallet = null;
		try {
			wallet = dao4.showWallet();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (Wallet id : wallet) {
			System.out.println(id);
		}
	}
	
	public static void searchWallet() {
		int walletid;
		System.out.println("Enter Wallet Id  ");
		walletid = sc.nextInt();
		Wallet wallet = null;
		try {
			wallet = dao4.searchWallet(walletid);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (wallet!=null) {
			System.out.println(wallet);
		} else {
			System.out.println("*** Record Not Found ***");
		}
		}
	
	public static void main(String[] args) throws ParseException {
		int choice;
		do {
			System.out.println(" O P T I O N S");
			System.out.println("---------------");
			System.out.println("1. show Restaurant  ");
			System.out.println("2. search Restaurant");
		    System.out.println("3. show Menu");
		    System.out.println("4. search Menu");
		    System.out.println("5. show Customer");
		    System.out.println("6. search Customer");
		    System.out.println("7. show Vendor");
		    System.out.println("8. search Vendor");
		    System.out.println("9. show Wallet");
		    System.out.println("10. search Wallet");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				showRestaurant();
				break;
			case 2 : 
				searchRestaurant();
				break;
			case 3 :
				showMenu();
			break;
			case 4 :
				searchMenu();
				break;
			case 5 :
				showCustomer();
				break;
			case 6 :
				searchCustomer();
				break;
			case 7 :
				showVendor();
				break;
			case 8 :
				searchVendor();
				break;
			case 9 :
				showWallet();
				break;
			case 10 :
				searchWallet();
				break;
			case 11 :
				return;
			}
		} while(choice!=10);

}
}
