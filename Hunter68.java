import java.util.*;
public class Hunter68 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int diff[]=new int[n-1];
		for(int i=0;i<n-1;i++){
			diff[i]=Math.abs(arr[i]-arr[i+1]);
		}
		int max=0;
        for(int i = 0; i < n-1; i++){
            if(max < diff[i]){
                max =i;
            }
        }
        if(arr[max]>arr[max+1]){
        	System.out.println("Index is="+max);
        }
        else{
        	System.out.println("Index is="+max+1);
        }
      //  System.out.println(max);

	}

}
