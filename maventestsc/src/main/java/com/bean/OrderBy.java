package com.bean;

import java.sql.Date;

public class OrderBy {
	//���
	private int order_did;
	//�������
	private String order_number;
	//����û���
	private String user_name;
	//�������
	private double order_amount;
	//�µ�����
	private Date order_date;
	//����״̬
	private String order_status;
	//֧��״̬
	private String payment_status;
	//֧����ʽ
	private String pay_way;
	//����״̬
	private String distribution_state;
	//���ͷ�ʽ
	private String distribution_mode;
	public int getOrder_did() {
		return order_did;
	}
	public void setOrder_did(int order_did) {
		this.order_did = order_did;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public double getOrder_amount() {
		return order_amount;
	}
	public void setOrder_amount(double order_amount) {
		this.order_amount = order_amount;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(String payment_status) {
		this.payment_status = payment_status;
	}
	public String getPay_way() {
		return pay_way;
	}
	public void setPay_way(String pay_way) {
		this.pay_way = pay_way;
	}
	public String getDistribution_state() {
		return distribution_state;
	}
	public void setDistribution_state(String distribution_state) {
		this.distribution_state = distribution_state;
	}
	public String getDistribution_mode() {
		return distribution_mode;
	}
	public void setDistribution_mode(String distribution_mode) {
		this.distribution_mode = distribution_mode;
	}
	@Override
	public String toString() {
		return "OrderBy [order_did=" + order_did + ", order_number=" + order_number + ", user_name=" + user_name
				+ ", order_amount=" + order_amount + ", order_date=" + order_date + ", order_status=" + order_status
				+ ", payment_status=" + payment_status + ", pay_way=" + pay_way + ", distribution_state="
				+ distribution_state + ", distribution_mode=" + distribution_mode + "]";
	}
	
}
