package com.cts.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SELLERS")
public class Seller {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SID")
	private int sellerId;

	@Column(name = "SNM", nullable = false)
	private String sellerName;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "UID")
	private EmartUsers emartUsers;

	@Column(name = "CPNAME", nullable = false)
	private String companyName;

	@Column(name = "GSTIN", nullable = false)
	private String gstIn;

	@Column(name = "ABOUTC", nullable = false)
	private String aboutCompany;

	@Column(name = "EML", nullable = false)
	private String email;

	@Column(name = "MBN", nullable = false)
	private String mobileNumber;

	@Column(name = "CREATED_DATE", nullable = false)
	private String createdDate;

	@Embedded
	private Address address;

	public Seller() {
		super();
	}

	public Seller(int sellerId) {
		super();
		this.sellerId = sellerId;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public EmartUsers getEmartUsers() {
		return emartUsers;
	}

	public void setEmartUsers(EmartUsers emartUsers) {
		this.emartUsers = emartUsers;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getGstIn() {
		return gstIn;
	}

	public void setGstIn(String gstIn) {
		this.gstIn = gstIn;
	}

	public String getAboutCompany() {
		return aboutCompany;
	}

	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
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

}
