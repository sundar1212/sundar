package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayCompare {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int[] arr1=new int[n];
		for(int i=0;i<n;i++){
			arr1[i]=arr[i];
		}
		int f=0;
		Arrays.sort(arr1);
		for(int i=0;i<n;i++){
			if(arr[i]!=arr1[i]){
				f=1;
			}
		}
			if(f==0){
				System.out.println("The given array is in sorted order");
			}
			else{
				System.out.println("The given array is not in sorted order");
			}
		
	}

}
