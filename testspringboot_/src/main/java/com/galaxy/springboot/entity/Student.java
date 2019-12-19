package com.galaxy.springboot.entity;

public class Student {
	private Integer uid;
	private String password;
	private String username;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Override
	public String toString() {
		return "Student [uid=" + uid + ", password=" + password + ", username=" + username + "]";
	}
	public Student(Integer uid, String password, String username) {
		super();
		this.uid = uid;
		this.password = password;
		this.username = username;
	}
	public Student() {
		super();
	}
	
}
