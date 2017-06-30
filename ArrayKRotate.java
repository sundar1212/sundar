package guvi;
import java.util.Scanner;
public class ArrayKRotate {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=in.nextInt();
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("Enter the array 1");
		for(int i=0;i<n;i++){
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter the rotated array 2");
		for(int i=0;i<n;i++){
			arr2[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				if(arr1[i]==arr2[j]){
					System.out.println("The array is rotated "+j+" times.");
				}
			}
			break;
		}
	}

}
