package com.mohan.lzcc.model;
/**
 * 
 * @author 王历飞
 * @version 1.0
 * @time 2014-03-07 10:06
 *
 */
public class OrderItem {
	private int id;//详细订单编号
	private Order order;//所属订单
	private Book book;//书籍
	private double price;//成交价格
	private int count;//购买数量
	private OrderStatus status;//订单状态
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	

}
