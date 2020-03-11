package com.cts.emart.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cts.emart.model.TxnType;

@Entity
@Table(name="TRANSACTIONS")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int transactionId;
	
	@Column(name="AMT", nullable = false)
	private double amount;
	
	@Column(name="TXNDT", nullable = false)
	private LocalDate transactionDate;
	
	@Column(name="TTYPE", nullable = false)
	private TxnType transactionType;
	
	@Column(name="DSCP")
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
