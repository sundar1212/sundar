package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class HalfAscHalfDes {
	public static void main(String[] args){
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
		Arrays.sort(arr1);
		int c=n-1;
		int[] arr2=new int[n];
		for(int i=0;i<n/2;i++){
			arr2[i]=arr1[c];
			c--;
		}
		int j=0;
		for(int i=n/2;i<n;i++){
			arr1[i]=arr2[j];
			j++;
		}
		System.out.println("The sorted array is:");
		for(int i=0;i<n;i++){
			System.out.println(arr1[i]);
		}
	}

}
