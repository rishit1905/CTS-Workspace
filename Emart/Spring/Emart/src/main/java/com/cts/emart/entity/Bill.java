package com.cts.emart.entity;

import java.time.LocalDate;

public class Bill {
	private int BillId;
	private LocalDate billDate;
	private Customer customer;
	private Seller seller;
	private Checkout checkout;
	
	public int getBillId() {
		return BillId;
	}
	public void setBillId(int billId) {
		BillId = billId;
	}
	public LocalDate getBillDate() {
		return billDate;
	}
	public void setBillDate(LocalDate billDate) {
		this.billDate = billDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public Checkout getCheckout() {
		return checkout;
	}
	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}
	
	
}
