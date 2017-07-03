package guvi;
import java.util.Scanner;
public class StringToInt {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the integer in String type");
		String s=in.next();
		int a=Integer.valueOf(s);
		System.out.println("INTEGER IS:"+a);
	}
}
