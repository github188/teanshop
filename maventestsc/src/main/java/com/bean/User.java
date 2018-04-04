package com.bean;

public class User {
	
	private int uid;
	
	private String uname;
	
	private String upassword;
	
	private String email;
	
	private Role role;
	
	private  int reveal;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public int getReveal() {
		return reveal;
	}

	public void setReveal(int reveal) {
		this.reveal = reveal;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", email=" + email + ", role="
				+ role + ", reveal=" + reveal + "]";
	}
	
	
 
}
