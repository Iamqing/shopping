package com.mohan.lzcc.model;

import java.sql.Timestamp;

/**
 * 
 * @author ������
 * @version 1.0
 * @time 2014-03-07 10:10
 *
 */
public class Order {
	private int id;//�������
	private User user;//�����û�
	private Timestamp orderTime;//�µ�ʱ��
	private double pricecount;//�����ܼ۸�
	private String consignee;//�ջ��˵�ַ
	private String consigneename;//�ջ�������
	private PayType paytype;//֧����ʽ
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Timestamp getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Timestamp orderTime) {
		this.orderTime = orderTime;
	}
	public double getPricecount() {
		return pricecount;
	}
	public void setPricecount(double pricecount) {
		this.pricecount = pricecount;
	}
	public String getConsignee() {
		return consignee;
	}
	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}
	public String getConsigneename() {
		return consigneename;
	}
	public void setConsigneename(String consigneename) {
		this.consigneename = consigneename;
	}
	public PayType getPaytype() {
		return paytype;
	}
	public void setPaytype(PayType paytype) {
		this.paytype = paytype;
	}
	
	
	

}
