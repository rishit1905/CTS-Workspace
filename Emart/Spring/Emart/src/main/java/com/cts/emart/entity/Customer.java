package com.cts.emart.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	@Column(name="FNM", nullable = false)
	private String firstName;
	
	@Column(name="LNM", nullable = false)
	private String lastName;
	
	@Column(name="EML", nullable = false)
	private String email;
	
	@Column(name="MBN", nullable = false)
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
