package guvi;
import java.util.Scanner;
public class JumpingNumbers {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a=in.nextInt();
		int len=(int)Math.log10(a)+1;
		int[] rem=new int[len];
		int num=a;
		int count=1;
		int i=len-1;
		while(num!=0){
			rem[i]=num%10;
			num/=10;
			i--;
		}
		int[] diff=new int[len-1];
		for(int x=0;x<len-1;x++){
			diff[x]=(int)Math.abs(rem[x]-rem[x+1]);
			count++;
		}
		int c=2;
		for(i=0;i<len-2;i++){
				if(diff[i]==diff[i+1]){
					c++;
				}
		}
		if(c==count){
			System.out.println("Jumping numbers");
		}
		else{
			System.out.println("Non-Jumping numbers");
		}
		
	}
}
