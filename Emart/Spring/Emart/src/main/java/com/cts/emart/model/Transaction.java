package com.cts.emart.model;

import java.time.LocalDate;

public class Transaction {
	private int transactionId;
	private double amount;
	private LocalDate transactionDate;
	private TxnType transactionType;
	private String description;
	
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

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	
}
