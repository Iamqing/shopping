package com.mohan.lzcc.model;

import java.sql.Timestamp;
/**
 * 
 * @author john������
 * @version 1.0
 * @time 2014-03-07 09:41
 *
 */
public class User {
	private int id;//�û����
	private LoginInfo logininfo;//��½�û�
	private UserLevel level;//�û�����
	private String realName;//�û���ʵ����
	private String gender;//�û��Ա�
	private int age;//�û�����
	private Timestamp birthday;//�û�����
	private String mailcode;//��������
	private String phone;//��ϵ��ʽ
	private String email;//����
	private Timestamp registTime;//ע��ʱ��
	private String question;//�ܱ�����
	private String answer;//�ܱ���
	private String profession;//�û�ְҵ
	private String unit;//�û���λ
	
	public User(int age, String profession, String unit) {
		super();
		this.age = age;
		this.profession = profession;
		this.unit = unit;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LoginInfo getLogininfo() {
		return logininfo;
	}
	public void setLogininfo(LoginInfo logininfo) {
		this.logininfo = logininfo;
	}
	public UserLevel getLevel() {
		return level;
	}
	public void setLevel(UserLevel level) {
		this.level = level;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Timestamp getBirthday() {
		return birthday;
	}
	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}
	public String getMailcode() {
		return mailcode;
	}
	public void setMailcode(String mailcode) {
		this.mailcode = mailcode;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Timestamp getRegistTime() {
		return registTime;
	}
	public void setRegistTime(Timestamp registTime) {
		this.registTime = registTime;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(LoginInfo logininfo) {
		super();
		this.logininfo = logininfo;
	}
	
}