package com.bean;

import java.util.Date;
//购物车表
public class Myshop_cart {
	//ID
	private int id;
	//商品ID
	private Product product;
	//会员ID
	private Myshop_member myshop_member;
	//创建时间
	private Date cart_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Myshop_member getMyshop_member() {
		return myshop_member;
	}
	public void setMyshop_member(Myshop_member myshop_member) {
		this.myshop_member = myshop_member;
	}
	public Date getCart_date() {
		return cart_date;
	}
	public void setCart_date(Date cart_date) {
		this.cart_date = cart_date;
	}
	@Override
	public String toString() {
		return "Myshop_cart [id=" + id + ", product=" + product + ", myshop_member=" + myshop_member + ", cart_date="
				+ cart_date + "]";
	}
	
}
