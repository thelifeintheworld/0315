import java.util.*;
public class Work0109{
	public static void main(String[] args){
	double h = 100.0;
	double sum = 100;
	for(int i=1;i<=10;i++){
	h = h/2;
	sum = sum +h*2;
System.out.println("第"+i+"次反弹"+h);
System.out.println("第"+i+"次落地共经过"+sum);

	}
System.out.println("第十次反弹"+h);
System.out.println("第十次落地共经过"+sum);
}
}