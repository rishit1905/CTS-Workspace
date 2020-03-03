package com.cts.emart.entity;

import java.time.LocalDate;

import com.cts.emart.model.TxnType;

public class Transaction {
	private int transactionId;
	private double amount;
	private LocalDate transactionDate;
	private TxnType transactionType;
	private Checkout checkout;
	private String description;
	private Bill bill;
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(LocalDate transactionDate) {
		this.transactionDate = transactionDate;
	}
	public TxnType getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(TxnType transactionType) {
		this.transactionType = transactionType;
	}
	public Checkout getCheckout() {
		return checkout;
	}
	public void setCheckout(Checkout checkout) {
		this.checkout = checkout;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
}
