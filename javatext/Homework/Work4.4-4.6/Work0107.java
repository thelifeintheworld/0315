import java.util.*;
public class Work0107{
	public static void main(String[] args){
/*	for( int i=100;i<1000;i++){
		int a = i/100;
		int b = (i-a*100)/10;
		int c = (i-a*100)%10;
		int x = a*a*a+b*b*b+c*c*c;
		if(i == x){
		System.out.println(i+"是水仙数，百位数为："+a+ "，十位数为："+b+"，个位数为："+c);
		}
		}*/
	int i = 100;
		while(i<10000){
		i++;
		int a = i/100;
		int b = (i-a*100)/10;
		int c = (i-a*100)%10;
		int x = a*a*a+b*b*b+c*c*c;
		if(i == x){
		System.out.println("有水仙数为："+i);
		}}
}
}
