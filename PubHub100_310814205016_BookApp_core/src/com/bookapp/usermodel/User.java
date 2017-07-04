package com.bookapp.usermodel;

public class User {
	
	private String Name;
	private String Emailid;
	private String password;
	private String active;
	private int id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmailid() {
		return Emailid;
	}
	public void setEmailid(String emailid) {
		Emailid = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String toString() {
		return "User [id=" + id + ", Name=" + Name + ", Emailid=" + Emailid + ", password=" + password + ", active="
				+ active + "]";
	}
	

}
