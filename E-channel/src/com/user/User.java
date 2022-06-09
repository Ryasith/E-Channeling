package com.user;

public class User {

	private int id;
	private String name;
	private String email;
	private String phone;
	private String gender;
	private String userName;
	private String password;
	private String age;
	
	public User(int id, String name, String email, String phone, String gender, String userName, String password, String age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public String getGender() {
		return gender;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getAge() {
		return age;
	}
}
