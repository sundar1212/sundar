package guvi;
import java.util.Scanner;
public class PowerOfDigits {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int len=(int)Math.log10(a)+1;
		int[] rem=new int[len];
		int num=a;
		int i=0;
		while(num!=0){
			rem[i]=num%10;
			num=num/10;
			i++;
		}
		int sum=0;
		int j=0;
		for(i=len-1;i>=0;i--){
			sum=(int) (Math.pow(rem[i],j)+sum);
			j++;
		}
		System.out.println("The output is :"+sum);
	}

}
