package guvi;
import java.util.Scanner;
public class PrintAftrgivNum {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the number ");
		int num=in.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i]==num){
				for(int x=i;x<n-1;x++){
					System.out.println(arr[x+1]);
				}
				for(i=0;i!=num;i++){
					System.out.println(arr[i]);
				}
			}
		}
		
	}

}
