import java.util.*;
public class Ketang0303{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入存钱年份：");
		int year = sc.nextInt();
		double baseli = 7.7/100;
		double lilv;
		if(year >0 && year <= 1){
		lilv = baseli *0.5;
		System.out.println("一年内的利率为："+lilv);
		}
		else if(year >1 && year <=3){
		lilv = baseli *0.7;
		System.out.println("三年内的利率为："+lilv);
		}else if(year >3 && year <= 5){
			lilv = baseli ;
		System.out.println("五年内的利率为："+lilv);
		}else if(year >5){
			lilv = baseli*1.1 ;
		System.out.println("五年以上的利率为："+lilv);
		}else{
		System.out.println("先存钱再说*-*！");
		}
		}



	
	}