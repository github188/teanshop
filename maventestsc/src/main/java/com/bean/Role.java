package com.bean;

public class Role {
	
	private int rid;
	
	private String rname;
	
	private int reveal;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public int getReveal() {
		return reveal;
	}

	public void setReveal(int reveal) {
		this.reveal = reveal;
	}

	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", reveal=" + reveal + "]";
	}
	
	

}
