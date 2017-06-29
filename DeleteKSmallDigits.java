package guvi;
import java.util.Scanner;
public class DeleteKSmallDigits {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int ip=a;
		int i=0;
		int len=(int)Math.log10(a)+1;
		int[] rem=new int[len];
		while(ip!=0){
			rem[i]=ip%10;
			ip/=10;
			i++;
		}
		for(i=0;i<len;i++){
			for(int j=i+1;j<len;j++){
				if(rem[i]<rem[j]){
					int temp;
					temp=rem[i];
					rem[i]=rem[j];
					rem[j]=temp;
				}
			}
		}
		int[] rem1=new int[len];
		System.out.println("Enter the k elements");
		int k=in.nextInt();
		for(i=len-1;i>=k;i--)
			System.out.print(rem[i]);
}
	}
