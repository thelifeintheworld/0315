package com.test.mor;

import java.awt.Point;
import java.util.Scanner;

public class CircleTest {
	public static int i,j;
	public static void main() {
		Circle c1 = new Circle();
		c1.r = 8;
		c1.p = Circle.Point(3,4);
	double	s = Circle.area(c1.r);
	System.out.println(Circle.Contains(null));
	}

static class Circle {
		static int r; 
		 static Point p;
		public static  Point Point(int i, int j) {	
		return p;
	}

public  String Contains(int x,int y) {
	System.out.print("输入点的坐标：");
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	String str="";
	int a1=a+r;
	int a2=a-r;
	int b = sc.nextInt();
	int b1=b+r;
	int b2=b-r;
	if((x<a1||x>a2)&&(y<b1||y>b2)) {
	str=	"包含在内！";
	}
	else {
		str ="不包含在内！";
	}
	return str;
}
//求面积
	public static double area(int r){	
		double s = 3.14*r*r;
		return s;
		}
//求包含
	public static String Contains(Point p) {
		System.out.print("输入点的坐标：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		String str="";
		int a1=a+r;
		int a2=a-r;
		int b = sc.nextInt();
		int b1=b+r;
		int b2=b-r;
		if((i<a1||i>a2)&&(j<b1||j>b2)) {
		str=	"包含在内！";
		}
		else {
			str ="不包含在内！";
		}
		return str;
		}
}
}
