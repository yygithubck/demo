package com.yy.test;

public class Demo {

	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAddress("Beijing");
		p.setName("Tom");
		p.setAge(26);
		
		System.out.println(p.toString());
	}
}
