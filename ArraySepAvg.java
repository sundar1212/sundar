package guvi;
import java.util.Scanner;
public class ArraySepAvg {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=in.nextInt();
		int[] arr=new int[n];
		int[] arr1=new int[n];
		int[] arr2=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int len=arr.length;
		if(len%2==0){
			for(int i=0;i<(len/2);i++){
				arr1[i]=arr[i];
			}
			int k=0;
			for(int i=len/2;i<len;i++){
				arr2[k]=arr[i];
				k++;
			}
		}
		
		if(len%2==1){
			for(int i=0;i<=(len/2);i++){
				arr1[i]=arr[i];
			}
			int j=0;
			for(int i=(len/2)+1;i<len;i++){
				arr2[j]=arr[i];
				j++;
			}
		}
		int sum1=0;
		int sum2=0;
		for(int i=0;i<=len/2;i++){
			sum1=sum1+arr1[i];
		}
		for(int i=0;i<len/2;i++){
			sum2=sum2+arr2[i];
		}
		int len1=arr2.length;
		int len2=arr2.length;
		int avg1=sum1/len1;
		int avg2=sum2/len2;
		if(avg1==avg2){
			System.out.println("Array1");
			for(int i=0;i<=len/2;i++){
				
				System.out.print(arr1[i]+" ");
			}
			System.out.println("Array2");
			for(int i=0;i<len/2;i++){
				System.out.print(arr2[i]+" ");
			}
		}
		else{
			System.out.println("Not Possible");
		}
		
	}

}
