package guvi;
import java.util.Scanner;
public class StringMup {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter two nums as Strings");
		String s1=in.next();
		String s2=in.next();
		int a=Integer.valueOf(s1);
		int b=Integer.valueOf(s2);
		int pro=a*b;
		String op=String.valueOf(pro);
		System.out.println(op);
	}

}
