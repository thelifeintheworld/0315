import java.util.*;
public class Work0116{
	public static void main(String[] args){
	int number;
	int encryptionNumber;
	int num1,num2,num3,num4;
	//@SuppressWarnigs("resource");
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入一个四位数字(1000~9999):");
	number = sc.nextInt();
		num1 = number/1000;
		num2 =(number%1000)/100;
		num3 =(number/10)%10;
		num4 =(number%100)%10;
		num1=(num1+5)%10;
		num2=(num2+5)%10;
		num3=(num3+5)%10;
		num4=(num4+5)%10;
		num1 = num1 + num4;
		num4 = num1 - num4;
		num1 = num1 - num4;
		num2 = num2 + num3;
		num3 = num2 - num3;
		num2 = num2 - num3;
		encryptionNumber = num1*1000+num2*100+num3*10+num4;
		System.out.println("输入的号码为："+number);
			System.out.println("加密后的号码为："+encryptionNumber);
}
}