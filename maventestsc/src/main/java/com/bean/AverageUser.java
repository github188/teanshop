package com.bean;

public class AverageUser {
	
	private int uid;
	
	private String uname;
	
	private String phone;
	
	private String emal;
	
	private String sex;
	
	private int age;
	
	private String address;
	
	private String password;
	
	private Problem problemid;
	
	private String answer;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmal() {
		return emal;
	}

	public void setEmal(String emal) {
		this.emal = emal;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Problem getProblemid() {
		return problemid;
	}

	public void setProblemid(Problem problemid) {
		this.problemid = problemid;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "AverageUser [uid=" + uid + ", uname=" + uname + ", phone=" + phone + ", emal=" + emal + ", sex=" + sex
				+ ", age=" + age + ", address=" + address + ", password=" + password + ", problemid=" + problemid
				+ ", answer=" + answer + "]";
	}
	


}
