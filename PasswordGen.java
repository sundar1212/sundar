package guvi;
import java.util.Scanner;
public class PasswordGen {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String and the number");
		String ip1=in.next();
		int num=in.nextInt();
		int lenst=ip1.length();
		int lennum=(int)Math.log10(num)+1;
		char last=ip1.charAt(lenst-1);
		//System.out.println(last);
		char fir=ip1.charAt(0);
		if(fir>=97&&fir<=122){
			int x=(int)fir-32;
			fir=(char)x;
		}
		else{
			int x=(int)fir+32;
			fir=(char)x;
		}
		int a=num;
		int i=0;
		int[] rem=new int[lennum];
		while(a!=0){
			rem[i]=a%10;
			a/=10;
			i++;
		}
		int sum=0;
		for(i=0;i<lennum;i++){
			sum=sum+rem[i];
		}
		int f;
		int l;
		f=sum/10;
		l=sum%10;
		int res=f+l;
		String fi=String.valueOf(rem[2]);
		String re=String.valueOf(res);
		String op=fi+fir+re+last;
		System.out.println("PASSWORS IS="+op);
			
	}
}
