package guvi;
import java.util.Scanner;
public class Coins {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the sum");
		int a=in.nextInt();
		int b,b1,c,c1,d,d1;
		b=a%5;
		b1=a/5;
		c=b%3;
		c1=b/3;
		d=c%1;
		d1=c/1;
		System.out.println("Total coins="+(b1+c1+d1));
		System.out.println("5's="+b1+" 3's= "+c1+" 1's= "+d1);
	}

}
