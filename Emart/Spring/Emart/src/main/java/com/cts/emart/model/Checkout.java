package com.cts.emart.model;

import com.cts.emart.entity.Cart;

public class Checkout {
	private int checkoutId;
	private double grossTotalAmount;
	private double gst;
	private double discountAmount;
	private double netPayableAmount;
	private Cart cart;
	private Discount discount;
	
	public int getCheckoutId() {
		return checkoutId;
	}
	public void setCheckoutId(int checkoutId) {
		this.checkoutId = checkoutId;
	}
	public double getGrossTotalAmount() {
		return grossTotalAmount;
	}
	public void setGrossTotalAmount(double grossTotalAmount) {
		this.grossTotalAmount = grossTotalAmount;
	}
	public double getGst() {
		return gst;
	}
	public void setGst(double gst) {
		this.gst = gst;
	}
	public double getDiscountAmount() {
		return discountAmount;
	}
	public void setDiscountAmount(double discountAmount) {
		this.discountAmount = discountAmount;
	}
	public double getNetPayableAmount() {
		return netPayableAmount;
	}
	public void setNetPayableAmount(double netPayableAmount) {
		this.netPayableAmount = netPayableAmount;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
	
}
