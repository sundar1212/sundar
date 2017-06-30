package guvi;
import java.util.Scanner;
public class Remove10Array {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Enter the element to be deleted");
		int del=in.nextInt();
		for(int i=0;i<n;i++){
			if(arr[i]!=del){
				System.out.println(arr[i]+" ");
			}
		}
	}
}
