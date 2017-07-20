import java.util.*;
public class Pro68 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the first name");
		String ip1=in.next();
		System.out.println("Enter the last name-");
		String ip2=in.next();
		System.out.println("Enter the pin(only numeric)");
		String ip3=in.next();
		int len=ip3.length();
		System.out.println("Enter the N value");
		int n=in.nextInt();
		int pin1=0;
		int pin2=0;
		String[] pin=ip3.split("");
		for(int i=0;i<n;i++){
			pin2=Integer.parseInt(pin[i]);
		}
		for(int i=len-1;i>=len-n;i--){
			pin1=Integer.parseInt(pin[i]);
		}
		String op="";
		String i1=String.valueOf(pin1);
		String i2=String.valueOf(pin2);
		//System.out.println(pin1);
		//System.out.println(pin2);
		if(ip1.length()>ip2.length()){
			char a1=ip1.charAt(0);
				op=a1+ip2+i2+i1;
				System.out.println(op);
			}
		if(ip1.length()<ip2.length()){
			char a1=ip2.charAt(0);
			op=a1+ip1+i2+i1;
			System.out.println(op);
			}
		if(ip1.length()==ip2.length()){
			String iip1=ip1.toLowerCase();
			String iip2=ip2.toLowerCase();
			char a1=iip1.charAt(0);
			char a2=iip2.charAt(0);
			int a=(int)a1;
			int b=(int)a2;
			if(a>b){
				String s1=ip1.substring(0,1);
				op=s1+ip2+i2+i1;
				System.out.println(op);
			}
			else{
				String s2=ip2.substring(0,1);
				op=s2+ip1+i2+i1;
				System.out.println(op);
			}
			
		}
		}
	
		
	}
