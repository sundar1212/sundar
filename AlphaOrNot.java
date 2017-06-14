package guvi;
import java.util.Scanner;
public class AlphaOrNot {
	public static void main(String[] args){
		String a=" ";
		int b;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the ip");
		a=in.next();
		b=(int) a.charAt(0);
		if((97<=b&&b<=122)||(65<=b&&b<=90)){
			System.out.println("It is an Alphabet");
		}
		else
			System.out.println("It is not an Alphabet");
	}

}
