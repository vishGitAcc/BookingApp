package com.app.mdata;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "user")
public class User {

	@Id
	private String id;

	private String userId;

	private String firstName;
	private String lastName;
	//private Date dateOfBirth;

	public User(String userId, String firstName, String lastName) {//, Date dateOfBirth
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		//this.dateOfBirth = dateOfBirth;
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLatName() {
		return lastName;
	}

	public void setLatName(String latName) {
		this.lastName = latName;
	}
/*
	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}*/

	@Override
	public String toString() {

		// TODO Auto-generated method stub
		return "User{ user Id : " + userId + "name: " + firstName + " " + lastName + " date of birth : "
				+ " }";
	}
	

}
