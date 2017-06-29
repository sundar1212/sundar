package guvi;
import java.util.Scanner;
public class DoubleString {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a String");
		String ip=in.next();
		int len=ip.length();
		String op1=ip.substring(0,len/2);
		String op2=ip.substring(len/2,len);
		if(op1.equals(op2)){
			System.out.println("A Double String");
		}
		else{
			System.out.println("Not a Double String");
		}
	}

}
