package com.test.night;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1 = PersonCreate.Person("zhangsan",33,1.73);
		Person p2 = new Person();
		p2 = PersonCreate.Person("lishi", 44, 1.74);
		p1.sayHello(p1);
		p2.sayHello(p2);
	}

	
}
