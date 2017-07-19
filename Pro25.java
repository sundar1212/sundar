import java.util.*;
public class Pro25 {
	public static void main ( String[] args ) {
		Scanner in = new Scanner ( System.in );
		System.out.println("Enter the n value");
		int n=in.nextInt();
		int a1 = 0;
		int a12=0;
		String a11="";
		for(int i=0;a1<=n;i++){
			String a=Integer.toBinaryString(i);
			int len=a.length();
		//	System.out.println(a+" "+len);
			a1=len;
			//System.out.println("a1="+a1);
			if(a1<n){
				for(int j=a1;j<=n-1;j++){
					a11=a11+"0";
					//System.out.println("a11="+a11);
				}
				a=a11+a;
				a11="";
				System.out.println(a);
			}
			else if(a.length()<=n) {
				System.out.println(a);
			}
				
			
		}
	}
}
