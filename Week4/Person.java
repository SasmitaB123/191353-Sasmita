package com.egjson;

import java.util.Arrays;

public class Person {

	private String name;
	private int agee;
	private Address[] address;
	
	public Person() {}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return agee	;
	}
	public void setAge(int age) {
		this.agee = age;
	}
	public Person(String name, int age, Address[] address) {
		super();
		this.name = name;
		this.agee = age;
		this.address = address;
	}
	

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + agee + ", address=" + Arrays.toString(address) + "]";
	}


	
	

	
	
}
