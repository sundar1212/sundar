package guvi;
import java.util.Scanner;
public class SumOfN {
	public static void main(String[] args){
		int n;
		int sum=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the n value");
		n=in.nextInt();
		for(int i=1;i<=n;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
