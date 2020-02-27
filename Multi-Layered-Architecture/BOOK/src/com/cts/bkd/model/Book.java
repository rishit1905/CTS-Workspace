package com.cts.bkd.model;

import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings("serial")
public class Book implements Serializable {
	
	private String bId;
	private String bName;
	private double bPrice;
	private LocalDate pDate;
	
	public Book() {
//		super();
	}

	public Book(String bId, String bName, double bPrice, LocalDate pDate) {
		super();
		this.bId = bId;
		this.bName = bName;
		this.bPrice = bPrice;
		this.pDate = pDate;
	}

	public String getbId() {
		return bId;
	}

	public void setbId(String bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public double getbPrice() {
		return bPrice;
	}

	public void setbPrice(double bPrice) {
		this.bPrice = bPrice;
	}

	public LocalDate getpDate() {
		return pDate;
	}

	public void setpDate(LocalDate pDate) {
		this.pDate = pDate;
	}

	@Override
	public String toString() {
		StringBuilder ot=new StringBuilder("Book ID: ");
		ot.append(bId);
		ot.append("\tBook Name: ");
		ot.append(bName);
		ot.append("\tBook Price: ");
		ot.append(bPrice);
		ot.append("\tPublish Date: ");
		ot.append(pDate);
		return ot.toString();
	}
	
	
	
	


}
