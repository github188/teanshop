package com.bean;

//订单项表
public class Myshop_order_item {
	//ID
	private int item_id;
	//商品ID
	private Product product;
	//订单ID
	private Myshop_order myshop_order;
	//购买数量
	private int item_count;
	//商品价格
	private double item_price;
	//优惠卷
	private double item_coupon;
	//成交价
	private double item_bid;
	public int getItem_id() {
		return item_id;
	}
	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Myshop_order getMyshop_order() {
		return myshop_order;
	}
	public void setMyshop_order(Myshop_order myshop_order) {
		this.myshop_order = myshop_order;
	}
	public int getItem_count() {
		return item_count;
	}
	public void setItem_count(int item_count) {
		this.item_count = item_count;
	}
	public double getItem_price() {
		return item_price;
	}
	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}
	public double getItem_coupon() {
		return item_coupon;
	}
	public void setItem_coupon(double item_coupon) {
		this.item_coupon = item_coupon;
	}
	public double getItem_bid() {
		return item_bid;
	}
	public void setItem_bid(double item_bid) {
		this.item_bid = item_bid;
	}
	@Override
	public String toString() {
		return "Myshop_order_item [item_id=" + item_id + ", product=" + product + ", myshop_order=" + myshop_order
				+ ", item_count=" + item_count + ", item_price=" + item_price + ", item_coupon=" + item_coupon
				+ ", item_bid=" + item_bid + "]";
	}
	
}
