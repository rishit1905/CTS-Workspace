package com.cts.gscp.model;

import java.io.Serializable;
import java.time.LocalDate;




@SuppressWarnings("serial")
public class Guitar implements Serializable{
	
	private String guitarModel;
	private String guitarName;
	private LocalDate dateAdded;
	private double price;
	
	public Guitar() {
		/* Default Constructor */
	}

	public Guitar(String guitarModel, String guitarName, LocalDate dateAdded, double price) {
		super();
		this.guitarModel = guitarModel;
		this.guitarName = guitarName;
		this.dateAdded = dateAdded;
		this.price = price;
	}

	public String getGuitarModel() {
		return guitarModel;
	}

	public void setGuitarModel(String guitarModel) {
		this.guitarModel = guitarModel;
	}

	public String getGuitarName() {
		return guitarName;
	}

	public void setGuitarName(String guitarName) {
		this.guitarName = guitarName;
	}

	public LocalDate getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(LocalDate dateAdded) {
		this.dateAdded = dateAdded;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder output=new StringBuilder("Guitar Model: ");
		output.append(guitarModel);
		output.append("\t Guitar Name: ");
		output.append(guitarName);
		output.append("\t Date Added:");
		output.append(dateAdded);
		output.append("\t Price:");
		output.append(price);
		return output.toString();
	
	}
	
	

}
