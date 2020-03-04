package com.cts.emart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CHECKOUT")
public class Checkout {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int checkoutId;
	
	@Column(name="GTA", nullable = false)
	private double grossTotalAmount;
	
	@Column(name="GST", nullable = false)
	private double gst;
	
	@Column(name="DSAMT")
	private double discountAmount;
	
	@Column(name="NPA", nullable = false)
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
