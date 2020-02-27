package com.cts.oopp.model;

public class Manager extends Employee {

	private int bonus;
	
	public Manager() {
		super();
	}

	public Manager(String name, int age, int salary, int bonus) {
		super(name, age, salary);
		this.bonus=bonus;
	}
	
	public void setBonus(int bonus) {
		this.bonus=bonus;
	}
	
	public int getBonus() {
		return bonus;
	}
	
	@Override
	
	public String toString() {
		return super.toString()+" Bonus: "+bonus;
	}

}
