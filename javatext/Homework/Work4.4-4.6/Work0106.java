import java.util.*;
public class Work0106{
	public static void main(String[] args){
		int[] A = {1,7,9,11,13,15,17,19};
		int[] B = {2,4,6,8,10};
		int[] C = new int[A.length+B.length];
		System.arraycopy(A,0,C,0,A.length);
		System.arraycopy(B,0,C,A.length,B.length); 
		System.out.println("合并后数组为："+Arrays.toString(C));
		int[] c2 = bubblesort(C);
		System.out.println("排序后数组为："+Arrays.toString(c2));
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
}