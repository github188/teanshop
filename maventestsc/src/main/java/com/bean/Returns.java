package com.bean;

import java.util.List;

public class Returns {
	private int return_id;
	private String return_serialNumber;
	private State state_id;
	private String refund_why;
	private int order_did;
	private int member_id;
	private Picture picture_id;
	private Shipper shipper_id;
	private String return_time;
	

	public State getState_id() {
		return state_id;
	}
	public void setState_id(State state_id) {
		this.state_id = state_id;
	}
	public int getReturn_id() {
		return return_id;
	}
	public void setReturn_id(int return_id) {
		this.return_id = return_id;
	}
	public String getReturn_serialNumber() {
		return return_serialNumber;
	}
	public void setReturn_serialNumber(String return_serialNumber) {
		this.return_serialNumber = return_serialNumber;
	}

	public String getRefund_why() {
		return refund_why;
	}
	public void setRefund_why(String refund_why) {
		this.refund_why = refund_why;
	}
	public int getOrder_did() {
		return order_did;
	}
	public void setOrder_did(int order_did) {
		this.order_did = order_did;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}

	
	public Picture getPicture_id() {
		return picture_id;
	}
	public void setPicture_id(Picture picture_id) {
		this.picture_id = picture_id;
	}
	public Shipper getShipper_id() {
		return shipper_id;
	}
	public void setShipper_id(Shipper shipper_id) {
		this.shipper_id = shipper_id;
	}
	public String getReturn_time() {
		return return_time;
	}
	public void setReturn_time(String return_time) {
		this.return_time = return_time;
	}
	@Override
	public String toString() {
		return "Returns [return_id=" + return_id + ", return_serialNumber=" + return_serialNumber + ", state_id="
				+ state_id + ", refund_why=" + refund_why + ", order_did=" + order_did + ", member_id=" + member_id
				+ ", picture_id=" + picture_id + ", shipper_id=" + shipper_id + ", return_time=" + return_time + "]";
	}
	
}
