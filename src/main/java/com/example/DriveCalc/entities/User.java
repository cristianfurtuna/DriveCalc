package com.example.DriveCalc.entities;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User  {
	private String UserName;
	private String FirstName;
	private String LastName;
	private String Password;
	
	@Id
	private Long ID;

	public User(String userName, String firstName, String lastName, String password, Long iD) {
		
		UserName = userName;
		FirstName = firstName;
		LastName = lastName;
		Password = password;
		ID = iD;
	}

	public User() {
		
		UserName = "";
		FirstName = "";
		LastName = "";
		Password = "";
		
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public Long getID() {
		return ID;
	}

	public void setID(Long iD) {
		ID = iD;
	}
	
	
	
	
}
