import java.util.*;
public class Hunter100 {
	public static void main(String[] args) {
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		String ip=String.valueOf(n);
		int sum=0;
		int[] arr1=new int[ip.length()];
		int[] arr2=new int[ip.length()];
		for(int i=0;i<ip.length();i++){
			String a1=ip.substring(i,i+1);
			int a11=Integer.parseInt(a1);
			arr1[i]=a11;
		}
		for (int i = 1; i < ip.length(); i++) {
			String a1=ip.substring(i,i+1);
			int a11=Integer.parseInt(a1);
			arr2[i]=a11;
			//System.out.println(arr2[i]);
		}
		for(int i=0;i<ip.length()-1;i++){
			//System.out.println(arr1[i]+" "+arr2[i+1]);
			sum=sum+(int)Math.pow(arr1[i],arr2[i+1]);
			//sum=(int)Math.pow(arr2[i+1],arr1[i]);
			//System.out.println(sum);
		}
		sum+=1;
		System.out.println(sum);
	}
}
