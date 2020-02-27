package com.cts.cd.ui;

import java.util.Map;
//import java.util.Set;
import java.util.TreeMap;
//import java.util.TreeSet;

import com.cts.cd.model.Person;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer,Person> person=new TreeMap<>();
		person.put(1,new Person("Rishi",23));
		person.put(4,new Person("Arnab",23));
		person.put(3,new Person("Rishi",23));
		person.put(2,new Person("Rupa",98));
		
		for(Integer key:person.keySet()) {
			System.out.printf("%d %s\n",key,person.get(key));
		}
		

	}

}
