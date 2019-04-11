package com.test.afternoon;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p2 = new 	Point(2,3);
		Point p1 = new 	Point(4,3);
		Point p3 = new 	Point(14,23);
		Circle c = new Circle(9,'红',p1);
		System.out.println(c.getArea());
		System.out.println(c.getColor());
		System.out.println(c.getPer());
		c.showAll();
		System.out.println(c.contains(p2) == true?"在图形内":"在图形外");
		 Rectangle d = new  Rectangle(6,8,'蓝',p2);
		 System.out.println(d.getArea());
			System.out.println(d.getColor());
			System.out.println(d.getPer());
		 d.showAll();
		 System.out.println(d.contains(p3) == true?"在图形内":"在图形外");
	}

}
