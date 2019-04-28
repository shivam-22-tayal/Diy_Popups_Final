package com.ibm.diypopups.payload;

import javax.validation.constraints.*;

public class SignUpRequest {
	@NotBlank
	@Size(min = 4, max = 40)
	private String firstname;

	@Size(max = 40)
	private String lastname;

	@NotBlank
	@Size(min = 3, max = 50)
	private String username;

	@NotBlank
	@Size(max = 50)
	@Email
	private String email;

	@NotBlank
	@Size(min = 6, max = 20)
	private String password;

	@Size(max = 10)
	private String gender;

	@Size(max = 15)
	private String phone;

	@Size(max = 10)
	private String type;

	private int Upcredits;
	private int Downcredits;
		public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getUpcredits() {
		return Upcredits;
	}

	public void setUpcredits(int upcredits) {
		Upcredits = upcredits;
	}

	public int getDowncredits() {
		return Downcredits;
	}

	public void setDowncredits(int downcredits) {
		Downcredits = downcredits;
	}


	
	
}