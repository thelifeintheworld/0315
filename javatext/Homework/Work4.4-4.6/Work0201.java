import java.util.*;
public class Work0201{
	public static void main(String[] args){
	String str = "ͳ��һ���ַ����ַ����е�����λ��";
	int l = str.length();
	int count =0;
	for(int i=0;i<l;i++){
		if(str.charAt(i)=='��'){
			count++;}
	}
	System.out.println("���ֵĴ���Ϊ��"+count);
}
}