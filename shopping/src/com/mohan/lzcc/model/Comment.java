package com.mohan.lzcc.model;

import java.sql.Timestamp;

/**
 * 
 * 
 * @author ������
 * @version 1.0
 * @time 2014-03-07 09:57
 *
 */
public class Comment {
	private int id;//���۱��
	private Comment pcomment;//������
	private User user;//������
	private Timestamp commentTime;//����ʱ��
	private String content;//��������
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Comment getPcomment() {
		return pcomment;
	}
	public void setPcomment(Comment pcomment) {
		this.pcomment = pcomment;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Timestamp getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(Timestamp commentTime) {
		this.commentTime = commentTime;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	

}
