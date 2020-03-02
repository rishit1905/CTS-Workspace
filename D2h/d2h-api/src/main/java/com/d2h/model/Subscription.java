package com.d2h.model;

import java.time.LocalDate;

public class Subscription {
	private int subscriptionId;
 	private Package packaze;
 	private LocalDate startDate;
 	private LocalDate endDate;
 	private long duration;
 	private double grossTotalAmount;
 	private double gstAmount;
 	private double discountAmount;
 	private double netPayableAmount;
 	private Discount discount;
 	
	public int getSubscriptionId() {
		return subscriptionId;
	}
	public void setSubscriptionId(int subscriptionId) {
		this.subscriptionId = subscriptionId;
	}
	public Package getPackaze() {
		return packaze;
	}
	public void setPackaze(Package packaze) {
		this.packaze = packaze;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public double getGrossTotalAmount() {
		return grossTotalAmount;
	}
	public void setGrossTotalAmount(double grossTotalAmount) {
		this.grossTotalAmount = grossTotalAmount;
	}
	public double getGstAmount() {
		return gstAmount;
	}
	public void setGstAmount(double gstAmount) {
		this.gstAmount = gstAmount;
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
	public Discount getDiscount() {
		return discount;
	}
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}
 	
 	
}
