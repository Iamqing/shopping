package com.mohan.lzcc.model;
/**
 * 
 * @author ������
 * @version 1.0
 * @time 2014-03-07 09:42
 *
 */
public class BankCard {
	private int id;//���п����
	private User user;//�����û�
	private String cardname;//���п��˺�
	private String cardpass;//���п�����
	private double cardbalance;//���п����
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
	public String getCardname() {
		return cardname;
	}
	public void setCardname(String cardname) {
		this.cardname = cardname;
	}
	public String getCardpass() {
		return cardpass;
	}
	public void setCardpass(String cardpass) {
		this.cardpass = cardpass;
	}
	public double getCardbalance() {
		return cardbalance;
	}
	public void setCardbalance(double cardbalance) {
		this.cardbalance = cardbalance;
	}
	/**
	 * 
	 */
	public BankCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param user
	 * @param cardname
	 */
	/**
	 * @param user
	 * @param cardname
	 * @param cardbalance
	 */
	public BankCard(User user, String cardname, double cardbalance) {
		super();
		this.user = user;
		this.cardname = cardname;
		this.cardbalance = cardbalance;
	}
	
	
	

}
