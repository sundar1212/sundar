import java.util.*;
public class Player72 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int max=0;
		for(int i=0;i<n-1;i++){
			if(arr[i]<arr[i+1]){
				max=arr[i+1];
				
			}
		}
		System.out.println(max);
	}
}
