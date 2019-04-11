package com.test.night;

public class VehicleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("benz","black",88.0);
		v2.run(v2);
		//v1.run(v1);
		//System.out.print(v2.brand);
		//System.out.print(v2.color);
//		car c = new car();
//		c.run(c);
		car c2 = new car("benz","black",1111.202);
		
		c2.run(c2);
		c2.loader(8);
	}

}
