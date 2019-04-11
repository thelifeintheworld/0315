package com.test.mor;

public class Weiyunsuan {
	public static void main(String[] args) {
		int a = 6960;
		int b = 8080;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(a);
		System.out.println(b);
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		
//		int temp = a;
//		a = b;
//		b = temp;
		
//		a = a+b;
//		System.out.println(a);
//		b = a-b;
//		System.out.println(b);
//		a = a-b;
				
		a ^= b;
		System.out.println(a);
		b ^= a;
		System.out.println(b);
		a ^= b;
		System.out.println(a);
		System.out.println(b);
	}
}
