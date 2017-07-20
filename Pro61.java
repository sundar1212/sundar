import java.util.*;
public class Pro61 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the String 1");
		String ip1=in.next();
		ip1=ip1.toLowerCase();
		System.out.println("Enter the String 2");
		String ip2=in.next();
		ip2=ip2.toLowerCase();
		int[] alpval=new int[130];
		int aa=1;
		for(int i=65,j=97;i<91&&j<123;i++,j++){
			alpval[i]=aa;
			alpval[j]=aa;
			aa++;
			//System.out.println(alpval[i]+" "+alpval[j]);
		}
		char a1=ip2.charAt(0);
		char a2=ip2.charAt(ip2.length()-1);
		//System.out.println(a1+" "+a2);
		int v1=(int)a1;
		int v2=(int)a2;
		String op1="";
		String op2="";
		int value=Math.abs(alpval[v1]-alpval[v2]);
		//System.out.println(alpval[v1]+" "+alpval[v2]);
		int[] asc=new int[200];
		for(int i=0;i<ip1.length();i++){
			char i1=ip1.charAt(i);
			int val=(int)i1;
			int b=val+value;
			if(b>122){
				b=b-122;
				b=96+b;
			}
			
			//System.out.println("i2 "+alpval[val]+" "+val+" "+b+" "+alpval[b]);
			//System.out.println("i1 "+alpval[val1]+" "+val1+" "+a+" "+alpval[a]);
			char o1=(char)b;

			op1=op1+o1;
			
		}
		for(int j=0;j<ip2.length();j++){
			char i2=ip2.charAt(j);
			int val1=(int)i2;
			int a=val1+value;
			if(a>122){
				a=a-122;
				a=96+a;
			}
			char o2=(char)a;
			op2=op2+o2;
		}
		char r1=ip2.charAt(0);
		char r2=ip2.charAt(ip2.length()-1);
	//	System.out.println(r1+" "+r2);
		op2=op2.substring(1,op2.length()-1);
		op2=r1+op2+r2;
		System.out.println(op1+" "+op2);
		
	}

}
