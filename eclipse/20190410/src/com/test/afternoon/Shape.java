package com.test.afternoon;

public class Shape {
double area;
double per;
char color;
Point p1;
public Shape() {}
public Shape(char color) {
	this.color = color;
}
public double getArea() {
	return this.area;
}
public double getPer() {
	return this.per;
}
public void showAll() {
	System.out.println("ͼ�ε����Ϊ��"+this.area);
	System.out.println("ͼ�ε��ܳ�Ϊ"+this.per);
	System.out.println("ͼ�ε���ɫΪ"+this.color);
}
public char getColor() {
	return this.color;
}
public boolean contains(Point p) {
	return false;
}
public boolean contains(int x,int y) {
	return false;
}
}
class Rectangle extends Shape{
	int width;
	int height;
	public Rectangle() {}
	public Rectangle(int width,int height,char color,Point p) {
		this.color = color;
		this.height = height;
		this.width = width;
		this.p1 = p; 
	}
	public double getArea() {
		return this.width*this.height;
	}
	public double getPer() {
		return 2*(this.height+this.width);
	}
	public void showAll() {
		System.out.println("�����ε����Ϊ��"+this.width*this.height);
		System.out.println("�����ε��ܳ�Ϊ��"+2*(this.height+this.width));
		System.out.println("�����ε���ɫΪ��"+this.color);
		System.out.println("�����εĿ�Ϊ��"+this.width);
		System.out.println("�����εĳ�Ϊ��"+this.height);
	}
	public boolean contains(Point p) {
		if(p.x>this.p1.x-this.width/2&&p.x<this.p1.x+this.width/2) {
			if(p.y>this.p1.y-this.height/2&&p.y<this.p1.y+this.height/2) {
				return true;}
		}
		return false;
	}
	public boolean contains(int x,int y) {
		if(x>this.p1.x-this.width/2&&x<this.p1.x+this.width/2) {
			if(y>this.p1.y-this.height&&y<this.p1.y+this.height) {
			return true;}
		}
		return false;
	}
}
class Circle extends Shape{
	int radius;
	public Circle() {}
	public Circle(int x,char c,Point p) {
		this.radius =x;
		this.color = c;
	}
	public double getArea() {
		this.area = Math.PI*this.radius*this.radius;
		return this.area;
	}
	public double getPer() {
		this.per = 2*Math.PI*this.radius;
		return this.per;
	}
	public void showAll() {
		System.out.println("Բ�ε����Ϊ��"+Math.PI*this.radius*this.radius);
		System.out.println("Բ�ε��ܳ�Ϊ��"+2*Math.PI*this.radius);
		System.out.println("Բ�εİ뾶Ϊ��"+this.radius);
		System.out.println("Բ�ε���ɫΪ��"+this.color);
	}
	public boolean contains(Point p) {
		boolean result = Math.pow((p.x-p1.x),2)+Math.pow((p.y-p1.y),2) <= this.radius*this.radius;
		return result;
		  }
		public boolean contains(int x,int y) {
		boolean result = Math.pow((x-p1.x),2)+Math.pow((y-p1.y),2) <= this.radius*this.radius;
		return result;
		}
}
class Point {
int x;
int y;
//����������  ��������ͬ�������б�ͬ
public Point() {
	
}
public Point(int p) {
	this(p,p);
}
public  Point(int x,int y) {
	this.x = x;
	this.y = y;
}
}
