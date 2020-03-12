package com.cts.model;

import java.time.LocalDate;

public class Transaction {

	private int txnId;
	private Customer customer;
	private Seller seller;
	private String transactionType;
	private double amount;
	private LocalDate txnDate;
	private String DSCP;

	public Transaction() {
	}

	public Transaction(int txnId, Customer customer, Seller seller, String transactionType, double amount,
			LocalDate txnDate, String dSCP) {

		this.txnId = txnId;
		this.customer = customer;
		this.seller = seller;
		this.transactionType = transactionType;
		this.amount = amount;
		this.txnDate = txnDate;
		DSCP = dSCP;
	}

	public int getTxnId() {
		return txnId;
	}

	public void setTxnId(int txnId) {
		this.txnId = txnId;
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

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getTxnDate() {
		return txnDate;
	}

	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}

	public String getDSCP() {
		return DSCP;
	}

	public void setDSCP(String dSCP) {
		DSCP = dSCP;
	}

}
