package com.afo.ecomm.fullstop.model.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User(int id, String userName, String phonenumber, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.phonenumber = phonenumber;
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private int id;

	private String userName;

	private String phonenumber;

	private String email;

}
