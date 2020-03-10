package com.cts.model;

import java.time.LocalDate;
import java.util.List;

public class PurchaseHistory {

	private Integer purchaseId;
	private Customer customer;
	private Seller seller;
	private Transaction transaction;
	private List<Product> product;
	private Discount discount;
	private int quantity;
	private LocalDate purchaseDate;

	public PurchaseHistory() {

	}

	public PurchaseHistory(int purchaseId, Customer customer, Seller seller, Transaction transaction,
			List<Product> product, Discount discount, int quantity, LocalDate purchaseDate) {
		super();
		this.purchaseId = purchaseId;
		this.customer = customer;
		this.seller = seller;
		this.transaction = transaction;
		this.product = product;
		this.discount = discount;
		this.quantity = quantity;
		this.purchaseDate = purchaseDate;
	}

	
	public Discount getDiscount() {
		return discount;
	}

	public void setDiscount(Discount discount) {
		this.discount = discount;
	}

	public int getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Integer purchaseId) {
		this.purchaseId = purchaseId;
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

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public LocalDate getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(LocalDate purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

}
