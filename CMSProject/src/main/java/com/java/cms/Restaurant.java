package com.java.cms;

public class Restaurant {

	  private int resid;
	  private String resname;
	  private String rescity;
	  private String resbranch;
	  private String resemail;
	  private String resmobile;
	  
	  
	public int getResId() {
		return resid;
	}
	public void setResid(int resid) {
		this.resid = resid;
	}
	public String getResname() {
		return resname;
	}
	public void setResname(String resname) {
		this.resname = resname;
	}
	public String getRescity() {
		return rescity;
	}
	public void setRescity(String rescity) {
		this.rescity = rescity;
	}
	public String getResbranch() {
		return resbranch;
	}
	public void setResbranch(String resbranch) {
		this.resbranch = resbranch;
	}
	public String getResemail() {
		return resemail;
	}
	public void setResemail(String resemail) {
		this.resemail = resemail;
	}
	public String getResmobile() {
		return resmobile;
	}
	public void setResmobile(String resmobile) {
		this.resmobile = resmobile;
	}
	@Override
	public String toString() {
		return "RestaurantDetails [resid=" + resid + ", resname=" + resname + ", rescity=" + rescity + ", resbranch="
				+ resbranch + ", resemail=" + resemail + ", resmobile=" + resmobile + "]";
	}
}
