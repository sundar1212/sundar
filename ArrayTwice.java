import java.util.*;
public class ArrayTwice {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len=in.nextInt();
		int[] arr=new int[len];
		int[] count=new int[len];
		System.out.println("Enter the array elements");
		for(int i=0;i<len;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<len;i++){
			for(int j=0;j<len;j++){
				if(i!=j)
				if(arr[i]==arr[j]){
					count[i]++;
				}
			}
		}
		for(int i=0;i<len;i++){
			if(count[i]==0){
				System.out.println("The non-repeated element is="+arr[i]);
			}
		}
		
	}

}
