import java.util.*;
public class Work0201{
	public static void main(String[] args){
	String str = "统计一个字符在字符串中的所有位置";
	int l = str.length();
	int count =0;
	for(int i=0;i<l;i++){
		if(str.charAt(i)=='字'){
			count++;}
	}
	System.out.println("出现的次数为："+count);
}
}