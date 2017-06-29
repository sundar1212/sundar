package guvi;
import java.util.Scanner;
public class ToFindTallest {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] arr=new int[5];
		System.out.println("Enter the heights(in cms) of the students in the class");
		for(int i=0;i<5;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<5;i++){
			for(int j=i+1;j<5;j++){
				if(arr[i]>arr[j]){
					int temp;
					temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
				}
			}
		}
		System.out.println("Enter the kth student hght u want");
		int x=in.nextInt();
		System.out.println("The height of the "+x+" Student is "+arr[x-1]);
	}
}
