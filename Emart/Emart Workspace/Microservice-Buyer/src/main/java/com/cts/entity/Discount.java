package com.cts.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DISCOUNTS")
public class Discount {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "DSID")
	private int discountId;

	@Column(name = "DSCODE", nullable = false, unique = true)
	private String discountCode;

	@Column(name = "PRCT", nullable = false)
	private double percentage;

	@Column(name = "SDT", nullable = false)
	private LocalDate startDate;

	@Column(name = "EDT", nullable = false)
	private LocalDate endDate;

	@Column(name = "DSDESC", nullable = false)
	private String discountDesc;

	public Discount() {
	}

	public Discount(int discountId, String discountCode, double percentage, LocalDate startDate, LocalDate endDate,
			String discountDesc) {
		super();
		this.discountId = discountId;
		this.discountCode = discountCode;
		this.percentage = percentage;
		this.startDate = startDate;
		this.endDate = endDate;
		this.discountDesc = discountDesc;
	}

	public int getDiscountId() {
		return discountId;
	}

	public void setDiscountId(int discountId) {
		this.discountId = discountId;
	}

	public String getDiscountCode() {
		return discountCode;
	}

	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
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

	public String getDiscountDesc() {
		return discountDesc;
	}

	public void setDiscountDesc(String discountDesc) {
		this.discountDesc = discountDesc;
	}

}
