package com.test.mor;

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.num = 1;
		p1.name = "�·�";
		p1.sex ="��";
		p1.ismarry=false;
		p2.name="����";
		p2.ismarry=false;
		p2.sex = "Ů";
		boolean a = Person.marry(p1,p2);
		System.out.println(a);
		// TODO Auto-generated method stub
		System.out.print(p1.name+"�İ����ǣ�"+p1.wh.name);
	}

}
//
class Person{
	int num;
	String name;
	String sex;
	int age;
	boolean ismarry;
	String idno;
	String add;
	String tel;
	Person	wh;
	public static boolean marry(Person p1,Person p2) {
		if((p1.ismarry ==false && p2.ismarry == false) && p1.sex != p2.sex) {
			p1.ismarry = p2.ismarry = true;
			p1.wh = p2;
			p2.wh =p1;
			return true;
		}else {
			return false;
		}
	}
}