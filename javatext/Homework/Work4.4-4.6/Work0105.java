import java.util.*;
public class Work0105{
	public static void main(String[] args){
	//f();
//}
//public static void f(){
for (int i = 4;i>=0 ;i-- )
{for (int j=0;j<=13 ;j++ )
{if (i<=4&&j<i)
{System.out.print(" ");
}
else if (j<=i+4)
{System.out.print("*");
}else if (j==13-i)
{System.out.print("*");
}else{System.out.print(" ");
}
}
System.out.println();
}
for (int a=0;a<=4 ;a++ )
{for (int b=0;b<=13 ;b++ )
{if (a==0||a==4)
{System.out.print("*");
}else if (b==0||b==13)
{System.out.print("*");
for (int k=1;k<=12 ;k++ )
{System.out.print(" ");
}
}
}
System.out.println();
}
}
}