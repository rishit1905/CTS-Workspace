package com.cts.emart.model;

import java.util.Set;

public class Seller {
	private int sellerId;
	private String sellerName;
	private String mobileNumber;
	private String email;
	private String companyName;
	private String aboutCompany;
	private String gstIN;
	private String doorNumber;
	private String street;
	private String city;
	private String state;
	private String pincode;
	
	private EmartUsers userAccount;
	
	public String getGstIN() {
		return gstIN;
	}
	public void setGstIN(String gstIN) {
		this.gstIN = gstIN;
	}
	public EmartUsers getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(EmartUsers userAccount) {
		this.userAccount = userAccount;
	}
	private Set<Product> product;
	
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
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
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getAboutCompany() {
		return aboutCompany;
	}
	public void setAboutCompany(String aboutCompany) {
		this.aboutCompany = aboutCompany;
	}
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	
}
