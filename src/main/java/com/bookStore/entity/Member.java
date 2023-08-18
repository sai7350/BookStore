package com.bookStore.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Id;
	private String FirstName;
	private String LastName;
	private String State;
	private String Address;
	private String City;
	private String EmailAddress;
	private Double Phoneno;
	private String Zipcode;
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(int id, String firstName, String lastName, String state, String address, String city,
			String emailAddress, Double phoneno, String zipcode) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		State = state;
		Address = address;
		City = city;
		EmailAddress = emailAddress;
		Phoneno = phoneno;
		Zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Member [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", State=" + State
				+ ", Address=" + Address + ", City=" + City + ", EmailAddress=" + EmailAddress + ", Phoneno=" + Phoneno
				+ ", Zipcode=" + Zipcode + "]";
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public Double getPhoneno() {
		return Phoneno;
	}
	public void setPhoneno(Double phoneno) {
		Phoneno = phoneno;
	}
	public String getZipcode() {
		return Zipcode;
	}
	public void setZipcode(String zipcode) {
		Zipcode = zipcode;
	}
}