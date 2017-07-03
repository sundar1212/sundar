package guvi;
import java.util.Scanner;
public class SumOddDigits {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int num=a;
		int len=(int)Math.log10(a)+1;
		int[] rem=new int[len];
		int i=len-1;
		while(num!=0){
			rem[i]=num%10;
			num/=10;
			i--;
		}
		int sum=0;
		for(int x=0;x<len;x++){
			sum=rem[x]+sum;
			x++;
		}
		if(sum%2==0){
			System.out.println("-1");
		}
		else{
			System.out.println("1");
		}
	}

}
