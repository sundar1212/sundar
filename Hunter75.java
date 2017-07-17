import java.util.*;
public class Hunter75 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter n value");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++){
			if(arr[i]>arr[i+1]){
				System.out.print(arr[i+1]+" ");
			}
			else{
				System.out.print("-1"+" ");
			}
		}
		if(arr[0]>arr[arr.length-1]){
			System.out.print(arr[arr.length-1]);
		}
		else{
			System.out.println(arr[0]);
		}
		
	}

}
