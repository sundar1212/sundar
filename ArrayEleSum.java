package guvi;
import java.util.Scanner;
public class ArrayEleSum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array length");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the number");
		int s=in.nextInt();
		int c=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				if((arr[i]+arr[j])==s){
					System.out.println(arr[i]+" "+arr[j]);
					c++;
				}
			}
		}
	if(c==0){
		System.out.println("No Match Found");
	}
	}

}
