package guvi;
import java.util.Scanner;
public class SumPalinOrNot {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Digits");
		int a=in.nextInt();
		int b=in.nextInt();
		int s=a+b;
		String s1=String.valueOf(s);
		String s2=new StringBuffer(s1).reverse().toString();
		if(s1.equals(s2)){
			System.out.println("Sum is Palindrome");
		}
		else
			System.out.println("Sum is not Palindrome");
	}
}
