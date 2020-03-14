package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="PRODUCTS")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="PID")
	private Integer productId;
	
	@ManyToOne
	@JoinColumn(name="CTID")
	private Category category;
	
	@ManyToOne
	@JoinColumn(name="SBID")
	private SubCategory subCategory;
	
	@ManyToOne
	@JoinColumn(name="SID")
	private Seller seller;
	
	@Column(name="PNM", nullable = false)
	private String productName;
	
	@Column(name="PRICE", nullable = false)
	private double price;
	
	@Column(name="PDESC", nullable = false)
	private String description;
	
	@Column(name="STOCK", nullable = false)
	private int stock;
	
//	@Column(name="IMAGE_URL", nullable = false)
//	private String photo;
//	
//	
//	public String getPhoto() {
//		return photo;
//	}
//	public void setPhoto(String photo) {
//		this.photo = photo;
//	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public SubCategory getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(SubCategory subCategory) {
		this.subCategory = subCategory;
	}
	
}

