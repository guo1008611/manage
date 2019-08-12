package com.guochenglong.bean;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * id 序号
	 */
	private  int id;
	/**  
	 * name  姓名
	 */
	private String name;
	/**
	 * sex  性别
	 */
	private String sex;
	
	/**
	 * phone  手机号
	 */
	private String phone;
	/**
	 * youxi
	 */
	private String youxi;
	
	/**
	 * age 年龄
	 */
	private int  age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getYouxi() {
		return youxi;
	}
	public void setYouxi(String youxi) {
		this.youxi = youxi;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", youxi=" + youxi + ", age="
				+ age + "]";
	}
	public User(int id, String name, String sex, String string, String youxi, int age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.phone = string;
		this.youxi = youxi;
		this.age = age;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
