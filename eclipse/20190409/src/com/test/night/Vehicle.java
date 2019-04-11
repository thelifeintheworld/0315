package com.test.night;

public class Vehicle {
 String brand;
String color;
 double speed;
public Vehicle() {
	this.speed=0.0;
}
public Vehicle(String brand,String color,double speed ) {
	this.brand = brand;
	this.color = color;
	this.speed = speed;
}
public void run(Vehicle v) {
System.out.println(v.brand+"汽车奔跑的功能为："+v.speed);
}
}
class car extends Vehicle{
	int loader;
	public car() {
	}
	public car(String brand,String color,double speed ) {
		super.brand= brand;
		super.color = color;
		super.speed = speed;
	}
	public void run(car c) {
		System.out.println(c.brand+"小汽车奔跑的功能为："+c.speed);
	}
	public void loader(int x) {
		this.loader = x;
		System.out.println(this.brand+"汽车可载"+this.loader+"ren");
	}
}
