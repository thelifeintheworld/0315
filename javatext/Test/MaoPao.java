import java.util.*;
public class MaoPao{
	public static void main(String[] args){
	//ð������
	int[] num = {22,33,56,76,54,2,11,99999,0,-66,-48};
	/*
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
			System.out.println(Arrays.toString(array));
		}
		return array;
	}*/

	//����ĸ���1
	//int[] num3 = new int[num.length];
	/*for(int i=0;i<num.length;i++){
	num3[i] = num[i];
	}
	System.out.println(Arrays.toString(num3));
	*/
	//����ĸ���2
	/*
	int[] num3 = new int[num.length];
	System.arraycopy(num,0,num3,0,num.length);
	System.out.println(Arrays.toString(num3));*/
	//����ĸ���3
	int[] num3 = Arrays.copyOf(num,num.length);
	System.out.println(Arrays.toString(num3));
}
}