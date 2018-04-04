package com.bean;

public class Shipper {
      private int shipper_id;
      private String shipper_name;
      private String shipper_contact;
      private String shipper_address;
      private String shipper_default;
	public int getShipper_id() {
		return shipper_id;
	}
	public void setShipper_id(int shipper_id) {
		this.shipper_id = shipper_id;
	}
	public String getShipper_name() {
		return shipper_name;
	}
	public void setShipper_name(String shipper_name) {
		this.shipper_name = shipper_name;
	}
	public String getShipper_contact() {
		return shipper_contact;
	}
	public void setShipper_contact(String shipper_contact) {
		this.shipper_contact = shipper_contact;
	}
	public String getShipper_address() {
		return shipper_address;
	}
	public void setShipper_address(String shipper_address) {
		this.shipper_address = shipper_address;
	}
	public String getShipper_default() {
		return shipper_default;
	}
	public void setShipper_default(String shipper_default) {
		this.shipper_default = shipper_default;
	}
	@Override
	public String toString() {
		return "Shipper [shipper_id=" + shipper_id + ", shipper_name=" + shipper_name + ", shipper_contact="
				+ shipper_contact + ", shipper_address=" + shipper_address + ", shipper_default=" + shipper_default
				+ "]";
	}
      
}
