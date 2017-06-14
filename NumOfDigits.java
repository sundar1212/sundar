package guvi;
import java.util.Scanner;
public class NumOfDigits {
	public static void main(String[] args){
		int ip;
		Scanner in=new Scanner(System.in);
		System.out.println("enter the ip");
		ip=in.nextInt();
		int count=0;
		int num;
		while(ip>0){
			ip=ip/10;
			count++;
		}
		System.out.println(count);
	}
	

}
