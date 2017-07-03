package guvi;
import java.util.Scanner;
public class SumOfDigit {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a=in.nextInt();
		int len=(int)Math.log10(a)+1;
		int[] rem=new int[len];
		int num=a;
		int i=len-1;
		while(num!=0){
			rem[i]=num%10;
			num/=10;
			i--;
		}
		int sum=0;
		int[] res=new int[len];
		for(i=0;i<len;i++){
			sum=rem[i]+sum;
			res[i]=sum;
		}
		sum=0;
		for(i=0;i<len;i++){
			sum=sum+res[i];
		}
		System.out.println("OUTPUT IS:"+sum);
	}
}
