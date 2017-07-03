package guvi;
import java.util.Scanner;
public class StringReverse {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s;
		System.out.println("Enter the String");
		s=in.next();
		String rev=new StringBuffer(s).reverse().toString();
		System.out.println(rev);

	}

}
