package guvi;
import java.util.Scanner;
public class RevDigit {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num;
		int rev=0;
		System.out.println("Enter the digit to be reversed");
		num=in.nextInt();
		while(num!=0){
			rev=rev*10;
			rev=rev+ num%10;
			num=num/10;
		}
		System.out.println(rev);
	}
	
	

}
