import java.util.*;
public class Player96 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String a="";
		a=String.valueOf(n);
		int len=a.length();
		String a1=a.substring(0,1);
		String a2=a.substring(len-1,len);
		int aa=Integer.parseInt(a1);
		int ab=Integer.parseInt(a2);
		int sum=aa+ab;
		System.out.println(sum);
	}
}
