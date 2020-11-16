package com.model;


public class UserLogin {
	

	private String name;
	private String passwd;

	
	public UserLogin() {
		
	}
	
	public UserLogin(String name, String passwd) {
		this.name = name;
		this.passwd = passwd;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String passwd) {
		this.passwd = passwd;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getPassword() {
		return this.passwd;
	}
	
	@Override
	public String toString() {
		return "Name : "+this.getName()+"\tAge : "+this.getPassword();
	}
	
}
