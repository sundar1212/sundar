package guvi;
import java.util.Scanner;
public class StringMulti {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the num to be multiplied");
		String s1=in.next();
		String s2=in.next();
		int a=Integer.valueOf(s1);
		int b=Integer.valueOf(s2);
		int c=a*b;
		String op=String.valueOf(c);
		System.out.println("RESULT AS STRING:"+op);
	}
}
