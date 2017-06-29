package guvi;
import java.util.Scanner; 
public class NumberEqualIndex {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the Array size");
		int n=in.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			if(arr[i]==i){
				System.out.println("The number "+i+"Equals at it index "+i);
			}
		}
	}
}
