package com.test.mor;

public class QTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] optio = new String[] {"《三国演义》","《水浒传》","《西游记》","《红楼梦》"};
		String[] ans = new String[] {"《三国演义》"};
		SingleQ s1= new SingleQ(1,"四大名著中成书时间最长的是?",optio,ans);
		String[] an1 = new String[] {"《红楼梦》"};
		s1.outout(s1);
		System.out.println(s1.checkAnswer(an1) == true?"回答正确":"回答错误");
		int[] a = {1,2,3,4};
		String[] ans2 = new String[]{"《三国演义》","《水浒传》","《西游记》","《红楼梦》"};
		MultiChoice m1 = new MultiChoice("是四大名著中书的是?",ans2,a);
		m1.outout(m1);
		System.out.println(m1.checkAnswer(a) == true?"回答正确":"回答错误");
		
	}

}
