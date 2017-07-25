import java.util.*;
public class Player115 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int l=(int)Math.log10(n)+1;
		int[] arr=new int[l];
		int a=n;
		int i=0;
		int sum=0;
		while(a!=0){
			arr[i]=a%10;
			a/=10;
			sum=sum+(arr[i]*arr[i]);
			i++;
		}
		System.out.println(sum);
		}

}
