package guvi;
import java.util.Scanner;
public class PowerOfNumber {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int num;
		int pow;
		System.out.println("Enter the number & power");
		num=in.nextInt();
		pow=in.nextInt();
		int res=(int)Math.pow(num,pow);
		System.out.println("RESULT IS :"+res);
	}

}
