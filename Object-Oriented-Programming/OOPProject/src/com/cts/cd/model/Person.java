package com.cts.cd.model;

public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String name, int age) {
		this.name=name;
		this.age=age;	
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return age;
	}
	
	@Override
	
	public String toString() {
		return "NAME: "+ name + " Age: " + age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person other) {
		if(this.name.equals(other.name)) {
			return this.age-other.age;
		}
		else 
			return this.name.compareTo(other.name);
	}
	
}
