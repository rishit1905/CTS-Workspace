package com.cts.oopp.model;

public class Students extends Person {

	private int fee;
	
	public Students() {
		super();
	}

	public Students(String name, int age,int fee) {
		super(name, age);
		this.fee=fee;
	}
	
	public void setFee(int fee) {
		this.fee=fee;
	}
	
	public int getFee() {
		return fee;
	}
	
	@Override
	
	public String toString() {
		return super.toString()+" Fee "+fee;
	}

}
