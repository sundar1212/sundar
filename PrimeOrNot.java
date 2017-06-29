package Module1;
import java.util.Scanner;
public class PrimeOrNot {
	public static void main(String[] args){
		int a;
		int m=0;
		int flag=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number");
		a=in.nextInt();
		in.close();
		m=a/2;
		for(int i=2;i<=m;i++){
			if(a%i==0){
				System.out.println("Not a prime number");
				flag=1;
				break;
			}
		}
			if(flag==0){
				System.out.println("Is a prime number");
			
		}
	}
}
