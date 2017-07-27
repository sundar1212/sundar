import java.util.*;
public class Player76 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		int[] arr=new int[n];
		int c1=0;
		int c2=0;
		int eve=0,odd=0;
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			if(arr[i]%2==0){
				c1++;
				eve=arr[i];
			}
			else{
				c2++;
				odd=arr[i];
			}
		}
		if(c1>c2){
			System.out.println(odd);
		}
		else{
			System.out.println(eve);
		}
	}
}
