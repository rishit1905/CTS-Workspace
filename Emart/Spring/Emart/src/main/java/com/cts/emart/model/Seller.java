package com.cts.emart.model;

import java.util.Set;

public class Seller {
	private int sellerId;
	private String sellerName;
	private String mobileNumber;
	private String email;
	private int Stock;
	private String companyName;
	private String aboutCompany;
	private Set<Product> product;
	
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
	public int getStock() {
		return Stock;
	}
	public void setStock(int stock) {
		Stock = stock;
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
