package guvi;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int fac=1;
		for(int i=1;i<=a;i++){
			fac=i*fac;
		}
		System.out.println(fac);

	}

}
