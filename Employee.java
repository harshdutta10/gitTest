package com.spring.ci;

public class Employee {
	
	String name;
	int age;
	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public void show()
	{
		System.out.println(name +" "+age);
	}

}
