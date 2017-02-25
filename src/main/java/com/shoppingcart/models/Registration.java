package com.shoppingcart.models;

public class Registration {

	// Registration form variables.
	private String firstName;

	private String lastName;

	private String eMail;

	private String password;

	// Default contructor to Registration class

	public Registration() {
	}

	// Parameterised constructor to registration class with class variables

	public Registration(String firstName, String lastName, String eMail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;

	}

	// getters and setters to Registration class variables

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// ToString method to convert registration class object variable to string
	@Override
	public String toString() {
		return "Registration [firstName=" + firstName + ", lastName=" + lastName + ", eMail=" + eMail + ", password="
				+ password + "]";
	}

}
