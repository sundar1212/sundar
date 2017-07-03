package guvi;
import java.util.Scanner;
public class CoPrime {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the two numbers");
		a=in.nextInt();
		b=in.nextInt();
		int num1=a/2;
		int num2=b/2;
		int c=0;
		for(int i=2;i<=num1&&i<=num2;i++){
			if(a%i==0&&b%i==0){
				c=1;
			}
		}
		if(c==1){
			System.out.println("The numbers are not Co-Prime");
		}
		else{
			System.out.println("The numbers are Co-Prime");
		}
	}

}
