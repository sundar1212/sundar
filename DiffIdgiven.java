package guvi;
import java.util.Scanner;
public class DiffIdgiven {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=in.nextInt();
		int count=0;
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the number");
		int x=in.nextInt();
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				if((arr[i]-arr[j]==x)||(arr[i]-arr[j]==-x)){
					count++;
				}
			}
		}
		System.out.println("TIMES:"+count);
	}

}
