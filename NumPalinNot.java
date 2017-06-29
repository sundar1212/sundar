package Module1;
import java.util.Scanner;
public class NumPalinNot {
	public static void main(String[] args){
	int num;
	int old;
	int rev=0;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number");
	num=in.nextInt();
	old=num;
	in.close();
	while(num!=0){
		rev=rev*10;
		rev=rev+ num%10;
		num=num/10;
	}
	if(old==rev){
		System.out.println("The num is palindrome");
	}
	else{
		System.out.println("The number is not a palindrome");
	}
}
}