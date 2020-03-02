package com.d2h.model;

import java.time.LocalDate;

public class Transaction {
	private int txnId;
	private double amount;
	private LocalDate dateOfTxn;
	private TxnType txntype;
	private String description;
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public LocalDate getDateOfTxn() {
		return dateOfTxn;
	}
	public void setDateOfTxn(LocalDate dateOfTxn) {
		this.dateOfTxn = dateOfTxn;
	}
	public TxnType getTxntype() {
		return txntype;
	}
	public void setTxntype(TxnType txntype) {
		this.txntype = txntype;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
