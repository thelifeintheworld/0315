import java.util.*;
public class Work0107{
	public static void main(String[] args){
/*	for( int i=100;i<1000;i++){
		int a = i/100;
		int b = (i-a*100)/10;
		int c = (i-a*100)%10;
		int x = a*a*a+b*b*b+c*c*c;
		if(i == x){
		System.out.println(i+"��ˮ��������λ��Ϊ��"+a+ "��ʮλ��Ϊ��"+b+"����λ��Ϊ��"+c);
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
		System.out.println("��ˮ����Ϊ��"+i);
		}}
}
}