package com.java.cms;

public class Vendor {

	private int vendorid;
	private String venname;
	private String vencity;
	private String venstate;
	private String venemail;
	private String venmobile;
	
	public int getVendorid() {
		return vendorid;
	}
	public void setVendorid(int vendorid) {
		this.vendorid = vendorid;
	}
	public String getVenname() {
		return venname;
	}
	public void setVenname(String venname) {
		this.venname = venname;
	}
	public String getVencity() {
		return vencity;
	}
	public void setVencity(String vencity) {
		this.vencity = vencity;
	}
	public String getVenstate() {
		return venstate;
	}
	public void setVenstate(String venstate) {
		this.venstate = venstate;
	}
	public String getVenemail() {
		return venemail;
	}
	public void setVenemail(String venemail) {
		this.venemail = venemail;
	}
	public String getVenmobile() {
		return venmobile;
	}
	public void setVenmobile(String venmobile) {
		this.venmobile = venmobile;
	}
	
	@Override
	public String toString() {
		return "Vendor [vendorid=" + vendorid + ", venname=" + venname + ", vencity=" + vencity + ", venstate="
				+ venstate + ", venemail=" + venemail + ", venmobile=" + venmobile + "]";
	}

	
	

}
