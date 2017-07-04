package guvi;
import java.util.Scanner;
public class ArraySubset {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array 1");
		int size1=in.nextInt();
		int[] arr1=new int[size1];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size1;i++){
			arr1[i]=in.nextInt();
		}
		System.out.println("Enter the size of array 2");
		int size2=in.nextInt();
		int[] arr2=new int[size2];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<size2;i++){
			arr2[i]=in.nextInt();
		}
		int count=0;
		for(int i=0;i<=size1-1;i++){
			for(int j=0;j<=size2-1;j++){
				if(arr1[i]==arr2[j]){
					count++;
				}
			}
		}
		if(count==size2){
			System.out.println("Array2 is a Subset of Array1");
		}
		else{
			System.out.println("Array2 is Not a Subset of Array1");
		}
	}
}
