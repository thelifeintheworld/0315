package com.test.mor;

public class QTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] optio = new String[] {"���������塷","��ˮ䰴���","�����μǡ�","����¥�Ρ�"};
		String[] ans = new String[] {"���������塷"};
		SingleQ s1= new SingleQ(1,"�Ĵ������г���ʱ�������?",optio,ans);
		String[] an1 = new String[] {"����¥�Ρ�"};
		s1.outout(s1);
		System.out.println(s1.checkAnswer(an1) == true?"�ش���ȷ":"�ش����");
		int[] a = {1,2,3,4};
		String[] ans2 = new String[]{"���������塷","��ˮ䰴���","�����μǡ�","����¥�Ρ�"};
		MultiChoice m1 = new MultiChoice("���Ĵ������������?",ans2,a);
		m1.outout(m1);
		System.out.println(m1.checkAnswer(a) == true?"�ش���ȷ":"�ش����");
		
	}

}
