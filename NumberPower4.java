package guvi;
import java.util.Scanner;
public class NumberPower4 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a=in.nextInt();
		int num=a;
		int len=(int)Math.log10(a)+1;
		int i=len-1;
		int[] rem=new int[len];
		while(num!=0){
			rem[i]=num%10;
			num/=10;
			i--;
		}int sum=0;
		for(int x=0;x<len;x++){
			sum=(int)Math.pow(rem[x],4)+sum;
		}
		System.out.println("OUTPUT IS:"+sum);
	}
}
