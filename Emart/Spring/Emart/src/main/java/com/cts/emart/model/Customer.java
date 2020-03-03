package com.cts.emart.model;

import java.util.Set;

public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private String email;
	private String mobileNumber;
	private Address address;
	private EmartUsers userAccount;
	private Set<Transaction> transaction;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public EmartUsers getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(EmartUsers userAccount) {
		this.userAccount = userAccount;
	}
	public Set<Transaction> getTransaction() {
		return transaction;
	}
	public void setTransaction(Set<Transaction> transaction) {
		this.transaction = transaction;
	}

}
