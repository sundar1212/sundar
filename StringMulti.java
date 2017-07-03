package guvi;
import java.util.Scanner;
public class StringMulti {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the num to be multiplied");
		String s1=in.next();
		String s2=in.next();
		long a=Long.valueOf(s1);
		long b=Long.valueOf(s2);
		long c=a*b;
		String op=String.valueOf(c);
		System.out.println("RESULT AS STRING:"+op);
	}
}
