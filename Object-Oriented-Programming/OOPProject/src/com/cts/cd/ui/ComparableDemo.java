package com.cts.cd.ui;

import java.util.Set;
import java.util.TreeSet;

import com.cts.cd.model.Person;

public class ComparableDemo {

	public static void main(String[] args) {
		Set<Person> person=new TreeSet<>();
//		person.add(new Person("Rishi",23));
		person.add(new Person("Arnab",23));
		person.add(new Person("Rishi",23));
		person.add(new Person("Rupa",98));
		
		for(Person persons:person) {
			System.out.println(persons);
		}
		

	}

}
