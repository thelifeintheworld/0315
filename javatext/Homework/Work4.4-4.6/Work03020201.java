import java.util.*;
public class Work03020201{
	public static void main(String[] args){
		//work 1
/*��ҵ���ŵĽ������������ɡ�
������ڻ����10��Ԫʱ���������10%��
�������10��Ԫ�����ڻ����20��Ԫʱ������10��Ԫ�Ĳ��֣������7.5%��
����20�򣬵��ڻ����40��ʱ������20��Ԫ�Ĳ��֣������5%��
����40�򣬵��ڻ����60��ʱ������40��Ԫ�Ĳ��֣������3%��
����60�򣬵��ڻ����100��ʱ������60��Ԫ�Ĳ��֣������1.5%��
����100��Ԫʱ������100��Ԫ�Ĳ��ְ�1%��ɣ�
�ڳ������趨һ������Ϊ����������Ӧ���Ž�����������֪ʶ�㣺������䣩 [������]*/
	/*	Scanner sc = new Scanner(System.in);
		System.out.print("������������Ԫ����");
		double a = sc.nextDouble();
		double b = 0;
		if(a>100.0){
			b = (a-b)*1/100+40*1.5/100+10*0.1+10*7.5/100+20*5/100+20*3/100;
		}else if(a<0){
		System.out.println("�����˾�Ȼ����Ҫ����*��*'!");
		}else if(a>60){
		b = (a-60)*1.5/100+10*0.1+10*7.5/100+20*5/100+20*3/100;
		}else if(a>40){
		b = (a-40)*3/100+10*0.1+10*7.5/100+20*5/100;
		}else if(a>20){
		b = (a-20)*5/100+10*0.1+10*7.5/100;
		}else if(a>10){
		b = (a-10)*7.5/100+10*0.1;
		}else{
		b = a*10/100;
		}
	System.out.println("���µĽ���Ϊ��"+b+"��Ԫ");  */
//work2


//������
/* ������һ���ɼ�a��ʹ��switch�ṹ���a�ĵȼ���
A��90-100��B��80-89��C��70-79��D��60-69��E��0~59
��֪ʶ�㣺�������switch�� [������]*/
	/*	String info = "";
		String num = "";
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ɼ�:");
		int a = scanner.nextInt();
		if(a<0){
			System.out.println("��������....");
		}
		else if(a<60) {
		 num = "x";
		}else if(a<70) {
		 num = "6";
		}else if(a<80) {
		 num = "7";
		}else if(a<90) {
		 num = "8";
		}else if(a<=100) {
		 num = "9";
		}else{
		System.out.println("�����ˣ�");
		}
			
		switch(num){
			case"9":
				info="���ĵȼ�Ϊ��A";
			case"8":
				info="���ĵȼ�Ϊ��B";
			case"7":
				info="���ĵȼ�Ϊ��C";
			case"6":
				info="���ĵȼ�Ϊ��D";
			default:
				info="���ĵȼ�Ϊ��E";
			}
		System.out.println(info);
		*/

	//work5
/*
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������:");
		int a = scanner.nextInt();
		if(a%2==0){
		System.out.println("���������ʱż��");
		}
		else{System.out.println("���������ʱ����");}
		*/

	//work6
	/*	Scanner scanner = new Scanner(System.in);
		System.out.print("����������:");
		int x = scanner.nextInt();
		if (x==1)
		{x=1;
		}else if (x==5)
		{x=5;
		}else if (x==10)
		{ x=10;
		}else 
		{x = (int)"none";
		}
		System.out.print("x��ֵΪ"+x); 
		*/
		//work7
	/*	Scanner scanner = new Scanner(System.in);
		System.out.print("����������:");
		int x = scanner.nextInt();
		if(x%5==0&&x%6==0){
		System.out.print(x+"���Ա�5��6����");
		}
		else if (x%5==0)
		{System.out.print(x+"���Ա�5����");
		}else if (x%6==0)
		{System.out.print(x+"���Ա�6����");
		}else{
		System.out.print(x+"�����Ա�5��6����");
		}*/
		//work8
	/*	Scanner scanner = new Scanner(System.in);
		System.out.print("���������:");
		int x = scanner.nextInt();
		if (x%100==0 && x%4 == 0 ||x%400==0)
		{System.out.print(x+"�����ꡣ");
		}*/
		//work9
/*		Scanner scanner = new Scanner(System.in);
		System.out.print("������ɼ�:");
		int x = scanner.nextInt();
		if(x>100){System.out.print("������������...");}
		else if (x>90)
		{System.out.print("�ɼ��ȼ�Ϊ��A");
		}else if (x>80)
		{System.out.print("�ɼ��ȼ�Ϊ��B");
		}else if (x>70)
		{System.out.print("�ɼ��ȼ�Ϊ��C");
		}else if (x>60)
		{System.out.print("�ɼ��ȼ�Ϊ��D");
		}else if (x<0)
		{System.out.print("������������...");
		}else{System.out.print("�ɼ��ȼ�Ϊ��E");}
		*/
		//4.1
	/*	int[] arr = {10,20,30,40,50};
		System.out.print(Arrays.toString(arr));		
		*/
		//work4.2
		String[] s1={"n","e","u","s","o","f","t","d","d","u","c","a","t","i","o","n"};
		String[] s2 = new String[s1.length];
		System.arraycopy(s1,0,s2,0,s1.length);
		System.out.println("s2:"+Arrays.toString(s2));
		
		//work4.3
/*		int[] num = {1,6,2,3,9,4,5,7,8};
		int[] num2 = bubblesort(num);
	    System.out.println(Arrays.toString(num2));
	}
	public static int[] bubblesort(int[] array){
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length-1-i;j++){
			if(array[j]>array[j+1]){
			int temp = array[j];
			array[j] = array[j+1];
			array[j+1] = temp;
			}
			}
			//System.out.println(Arrays.toString(array));
		}
		return array;
	}
}*/
		//4.5
	/*	double[][] arr= new double[5][4];
		arr = {{11.2,33,555},{666,99.0,1,4},{34.21,55.55,3.214},{0.222,34,57},{99,44}};
		System.out.println(Arrays.toString(arr));
		*/
		//4.6
/*		int[] arr = {18,25,7,36,13,2,89,63};
			int i;
		print(arr);
		System.out.println("���Ԫ��Ϊ��"+max(arr));
		System.out.println("���Ԫ������Ϊ��"+maxIndex(arr));
	}
		public static void print(int[] arr){
		for (int i=0;i<arr.length ;i++ )
		{System.out.print(arr[i]+"\t");
		}
		System.out.println();
		}
				public static int max(int[] arr){
				int max=arr[0];
				for (int i=0;i<arr.length ;i++ )
				{if (arr[i]>max)
				{max=arr[i];
				}
				}
				return max;
				}
				public static int maxIndex(int[] arr){
				int maxIndex=0;
				for (int i=0;i<arr.length ;i++ )
				{if (arr[i]<arr[maxIndex])
				{maxIndex=i;
				}
				}
				return maxIndex;
				}

		*/
}
}