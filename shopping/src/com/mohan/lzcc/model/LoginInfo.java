package com.mohan.lzcc.model;
/**
 * 
 * @author ������
 * @version 1.0
 * @time 2014-03-07 09:30
 *
 */
public class LoginInfo {
	private int id;//��¼��Ϣ���
	private String username;//��½�˺�
	private String password;//��½����
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginInfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	public LoginInfo(int id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

}
