import java.util.*;
public class pro69 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=in.next();
		int len=s1.length();					//48-57
		char[] val=new char[100];
		int[] num=new int[10];
		for(int i=48;i<=57;i++){
			val[i]=(char)i;
		}
		int x=0;
		for(int i=0;i<len;i++){
			char i1=s1.charAt(i);
			if(i1>=48&&i1<=57){
				num[x]=i1;
				x++;
			}
		}
		char max=0;
		char min=0;
		for(int i=0;i<x;i++){
			if(val[num[i]]>max){
				max=(char)val[num[i]];
			}
		}
		min=max;
		for(int i=0;i<x;i++){
			if(val[num[i]]<min){
				min=(char)val[num[i]];
			}
		}
		//System.out.println(max);
		//System.out.println(min);
		
		int sum1=0;
		for(int i=0;i<x;i++){
			String aa=String.valueOf(val[num[i]]);
			int nn=Integer.parseInt(aa);
			String n1=String.valueOf(max);
			int max1= Integer.parseInt(n1);
			int dd=(int)(nn*max1);
			sum1=(int)sum1+dd;
		}
		int sum2=1;
		for(int i=0;i<x;i++){
			String aa=String.valueOf(val[num[i]]);
			int nn=Integer.parseInt(aa);
			String n1=String.valueOf(min);
			int min1= Integer.parseInt(n1);
			int dd=(int)(nn+min1);
			
			sum2=(int)sum2*dd;
		}
		int xx=sum1;
		int yy=sum2;
		//System.out.println(sum1+" "+sum2);
		int rem=0;
		int ttl=0;
		while(xx!=0){
			rem=xx%10;
			ttl=rem+ttl;
			xx/=10;
		}
		int x1=ttl;
		int t1=0;
		while(x1!=0){
			rem=x1%10;
			t1=rem+t1;
			x1/=10;
		}
		int t2=0;
		while(yy!=0){
			rem=yy%10;
			t2=rem+t2;
			yy/=10;
		}
		int x3=t2;
		int t4=0;
		while(x3!=0){
			rem=x3%10;
			t4=rem+t4;
			x3/=10;
		}
		//System.out.println(t4+" "+t1);
		int op=0;
		if(t1>t4){
			op=t4;
		}
		else{
			op=t1;
		}
		op=(int) Math.pow(op,2);
		System.out.println(op);
	}
}
