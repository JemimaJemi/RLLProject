package com.java.cms;

public class Menu {

	private int menuid;
	private int resid;
	private String itemname;
	private String menutype;
	private String price;
	
	
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public int getResid() {
		return resid;
	}
	public void setResid(int resid) {
		this.resid = resid;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getMenutype() {
		return menutype;
	}
	public void setMenutype(String menutype) {
		this.menutype = menutype;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", resid=" + resid + ", itemname=" + itemname + ", menutype=" + menutype
				+ ", price=" + price + "]";
	}

}
