import java.util.*;
public class AlternateSort {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		int len=arr.length;
			if(len%2==0){
				for(int i=0;i<arr.length/2;i++){
				System.out.print(" "+arr[len-1]+" "+arr[i]);
				len--;
			}
		}
			else{
				for(int i=0;i<arr.length/2;i++){
					System.out.print(" "+arr[len-1]+" "+arr[i]);
					len--;
			}
				if(arr.length%2!=0){
					int s=arr.length/2;
					System.out.println(" "+arr[s]);
				}
			}
	}

}
