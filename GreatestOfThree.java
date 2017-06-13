package guvi;
import java.util.Scanner;
public class GreatestOfThree {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter the 3 nums");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		if(a>b&&a>c){
			System.out.println (a);
		}
		else if(b>c&&b>a){
			System.out.println (b);
		}
		else{
			System.out.println (c);
		}
	}

}
