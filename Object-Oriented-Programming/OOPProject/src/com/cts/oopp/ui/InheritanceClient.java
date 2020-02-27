package com.cts.oopp.ui;

import com.cts.oopp.model.Employee;
import com.cts.oopp.model.Manager;
import com.cts.oopp.model.Person;
import com.cts.oopp.model.Students;

public class InheritanceClient {

	public static void main(String[] args) {
		Person person=new Person();
		person.setName("Ramesh");
		person.setAge(24);
		System.out.println(person);
		
		Employee employee=new Employee();
		employee.setName("Vivek");
		employee.setAge(42);
		employee.setSalary(75000);
		System.out.println(employee);
		
		Students students=new Students();
		students.setName("Rishi");
		students.setAge(23);
		students.setFee(45000);
		System.out.println(students);
		
		Manager manager=new Manager();
		manager.setName("Jemima");
		manager.setAge(46);
		manager.setSalary(100000);
		manager.setBonus(26000);
		System.out.println(manager);
	}

}
