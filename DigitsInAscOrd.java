package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class DigitsInAscOrd {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int len=(int)Math.log10(a)+1;
		int[] rem=new int[len];
		int num=a;
		int i=0;
		while(num!=0){
			rem[i]=num%10;
			num/=10;
			i++;
		}
		Arrays.sort(rem);
		for(i=0;i<len;i++){
			System.out.print(rem[i]);
		}
	}
}
