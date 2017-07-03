package guvi;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the table you need");
		int a=in.nextInt();
		for(int i=1;i<=16;i++){
			System.out.println(a+"*"+i+"="+(a*i));
		}
	}
}
