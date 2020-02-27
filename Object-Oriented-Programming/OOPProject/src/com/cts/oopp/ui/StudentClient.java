package com.cts.oopp.ui;

import com.cts.oopp.model.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student.setCourse("Java FSD");
		Student.setFees(80000);
		
		Student [] students=new Student[3];
		students[0]=new Student(1,"Rohit");
		students[1]=new Student(2,"Ramesh");
		students[2]=new Student(3,"Suresh");
		

	}

}
