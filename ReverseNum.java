package guvi;
import java.util.Scanner;
public class ReverseNum {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=in.nextInt();
		String s=String.valueOf(a);
		String str=new StringBuffer(s).reverse().toString();
		int a1=Integer.valueOf(str);
		System.out.println(a1);

	}

}
