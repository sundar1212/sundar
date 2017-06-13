package Module1;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a;
		System.out.println("\n Enter the number....");
		a=in.nextInt();
		if(a%2==0&&a!=0){
			System.out.println("\n the number is even...");
		}
		else if(a%2!=0){
			System.out.println("\n The number is odd...");
		}
		else{
			System.out.println("\n The number is Zero...");
		}
	}

}
