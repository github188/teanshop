package com.bean;

//收货人信息表
public class Myshop_receive {
	//ID
	private int receive_id;
	//会员ID
	private Myshop_member myshop_member;
	//收货人
	private String receive_name;
	//收货人电话
	private String receive_phone;
	//详细地址
	private String receive_address;
	//是否为默认地址（默认为1）
	private int state;
	public int getReceive_id() {
		return receive_id;
	}
	public void setReceive_id(int receive_id) {
		this.receive_id = receive_id;
	}
	public Myshop_member getMyshop_member() {
		return myshop_member;
	}
	public void setMyshop_member(Myshop_member myshop_member) {
		this.myshop_member = myshop_member;
	}
	public String getReceive_name() {
		return receive_name;
	}
	public void setReceive_name(String receive_name) {
		this.receive_name = receive_name;
	}
	public String getReceive_phone() {
		return receive_phone;
	}
	public void setReceive_phone(String receive_phone) {
		this.receive_phone = receive_phone;
	}
	public String getReceive_address() {
		return receive_address;
	}
	public void setReceive_address(String receive_address) {
		this.receive_address = receive_address;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Myshop_receive [receive_id=" + receive_id + ", myshop_member=" + myshop_member + ", receive_name="
				+ receive_name + ", receive_phone=" + receive_phone + ", receive_address=" + receive_address
				+ ", state=" + state + "]";
	}
	
}
