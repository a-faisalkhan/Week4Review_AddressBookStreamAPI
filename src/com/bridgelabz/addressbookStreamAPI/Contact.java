package com.bridgelabz.addressbookStreamAPI;

public class Contact {

	String firstName;
	String lastName;
	String city;
	String mobileNumber;
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Contact(String firstName, String lastName, String city, String mobileNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", mobileNumber="
				+ mobileNumber + "]";
	}

}
