package com.cts.oopp.model;

public class Student {
	private int rollNumber;
	private String name;
	private static String course;
	private static int fees;
	
	public Student() {
		
	}
	
	public Student(int rollNumber, String name) {
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public static void setCourse(String nCourse) {
		course=nCourse;
	}
	
	public static String getCourse() {
		return course;
	}

	public static void setFees(int nFees) {
		fees=nFees;
	}
	
	public static int getFees() {
		return fees;
	}

	@Override
	public String toString() {
		return "Roll Number=" + rollNumber + ", Name=" + name + ", Course=" + course + ", Fees=" + fees;
	}

	
}
