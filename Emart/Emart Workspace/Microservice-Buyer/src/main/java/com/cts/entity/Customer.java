package com.cts.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CSID")
	private int customerId;

	@Column(name = "FNM", nullable = false)
	private String firstName;

	@Column(name = "LNM", nullable = false)
	private String lastName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UID")
	private EmartUsers emartUsers;

	@Column(name = "EML", nullable = false)
	private String email;

	@Column(name = "MBN", nullable = false)
	private String mobile;


	public Customer() {
	}

	public Customer(int customerId, String firstName, String lastName, EmartUsers emartUsers, String email,
			String mobile) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emartUsers = emartUsers;
		this.email = email;
		this.mobile = mobile;
	}

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

	public EmartUsers getEmartUsers() {
		return emartUsers;
	}

	public void setEmartUsers(EmartUsers emartUsers) {
		this.emartUsers = emartUsers;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
