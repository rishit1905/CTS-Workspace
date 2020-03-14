package com.cts.entity;



import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Payments")

public class Payment {
	@Id
	@Column(name="nameCard")
	private String nameOnCard;
	@Column(name="creditNumber")
	private String creditCardNumber;
	@Column(name="expMon")
	private String expiryMonth;
	@Column(name="expYear")
	private String expiryYear;
	@Column(name="cvv")
	private int cvv;
	
	@Embedded
	private DeliveryAddress delivery;
	public Payment() {
		
	}
	
	
	public DeliveryAddress getDelivery() {
		return delivery;
	}


	public void setDelivery(DeliveryAddress delivery) {
		this.delivery = delivery;
	}


	public Payment(String nameOnCard, String creditCardNumber, String expiryMonth, String expiryYear, int cvv, DeliveryAddress delivery) {
		super();
		this.nameOnCard = nameOnCard;
		this.creditCardNumber = creditCardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvv = cvv;
		this.delivery=delivery;
	}


	public String getNameOnCard() {
		return nameOnCard;
	}
	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public String getExpiryYear() {
		return expiryYear;
	}
	public void setExpiryYear(String expiryYear) {
		this.expiryYear = expiryYear;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	
	

}
