package com.test.night;

public class PersonCreate {
	public static  Person Person(String name,int height,double weight) {
		Person p = new Person();
		p.name = name;
		p.height = height;
		p.weight = weight;
		return p;
	}
}
