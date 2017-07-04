package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayOneEle {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=in.nextInt();
		int[] arr=new int[n];
		if(n%2==1){
			System.out.println("Enter the array elements");
			for(int i=0;i<n;i++){
				arr[i]=in.nextInt();
			}
			Arrays.sort(arr);
			int c=0;
			for(int i=0;i<n-1;i++){
				for(int j=i+1;j<n-1;j++){
				if(arr[i]==arr[j]){
					j=n-1;
					i++;
				}
				else{
					c=arr[i];
					break;
					}
				}
			}
			if((arr[n-1]!=arr[n-2])&&(c==0)){
				System.out.println("The element repeated once is :"+arr[n-1]);
			}
			else{
				System.out.println("The element repeated once is :"+c);
			}
		}
		else{
			System.out.println("The array length must be odd");
		}
	}
}
