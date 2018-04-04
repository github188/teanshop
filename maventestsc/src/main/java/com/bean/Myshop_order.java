package com.bean;

import java.util.Date;

//���������
public class Myshop_order {
	//ID
	private int order_id;
	//�������
	private String order_number;
	//�����ܽ��
	private double order_amount;
	//�µ�����
	private Date order_date;
	//�ᵥ����
	private Date finished_time;
	//��ԱID
	private Myshop_member myshop_member;
	//����״̬
	private int order_status;
	//֧��״̬
	private int payment_status;
	//����״̬
	private int distribution_state;
	//֧����ʽ
	private int pay_way;
	//���ͷ�ʽ
	private int distribution_mode;
	//�ջ�����Ϣ
	private Myshop_receive myshop_receive;
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getOrder_number() {
		return order_number;
	}
	public void setOrder_number(String order_number) {
		this.order_number = order_number;
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
	public Date getFinished_time() {
		return finished_time;
	}
	public void setFinished_time(Date finished_time) {
		this.finished_time = finished_time;
	}
	public Myshop_member getMyshop_member() {
		return myshop_member;
	}
	public void setMyshop_member(Myshop_member myshop_member) {
		this.myshop_member = myshop_member;
	}
	public int getOrder_status() {
		return order_status;
	}
	public void setOrder_status(int order_status) {
		this.order_status = order_status;
	}
	public int getPayment_status() {
		return payment_status;
	}
	public void setPayment_status(int payment_status) {
		this.payment_status = payment_status;
	}
	public int getDistribution_state() {
		return distribution_state;
	}
	public void setDistribution_state(int distribution_state) {
		this.distribution_state = distribution_state;
	}
	public int getPay_way() {
		return pay_way;
	}
	public void setPay_way(int pay_way) {
		this.pay_way = pay_way;
	}
	public int getDistribution_mode() {
		return distribution_mode;
	}
	public void setDistribution_mode(int distribution_mode) {
		this.distribution_mode = distribution_mode;
	}
	public Myshop_receive getMyshop_receive() {
		return myshop_receive;
	}
	public void setMyshop_receive(Myshop_receive myshop_receive) {
		this.myshop_receive = myshop_receive;
	}
	@Override
	public String toString() {
		return "Myshop_order [order_id=" + order_id + ", order_number=" + order_number + ", order_amount="
				+ order_amount + ", order_date=" + order_date + ", finished_time=" + finished_time + ", myshop_member="
				+ myshop_member + ", order_status=" + order_status + ", payment_status=" + payment_status
				+ ", distribution_state=" + distribution_state + ", pay_way=" + pay_way + ", distribution_mode="
				+ distribution_mode + ", myshop_receive=" + myshop_receive + "]";
	}
}
