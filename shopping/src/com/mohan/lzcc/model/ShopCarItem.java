package com.mohan.lzcc.model;
/**
 * 
 * @author ������
 * @version 1.0
 * @time 2014-03-07 10:14
 *
 */
public class ShopCarItem {
	private int id;//���ﳵ������Ʒ���
	private User user;//�����û�
	private Book book;//�����鼮
	private int count;//��������
	private double price;//�ܼ۸�
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
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
