import java.util.*;
public class Hunter48 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the two input strings");
		String ip1=in.next();
		String ip2=in.next();
		int len2=ip2.length();
		String[] ip11=ip1.split("");
		char fir=ip2.charAt(0);
		String op="";
		int flag=0;
		int c=0;
		String firs=String.valueOf(fir);
		for(int i=0;i<ip1.length();i++){
			if(firs.equals(ip11[i])){
				c=i;
				if(c+len2<ip1.length()){
					op=ip1.substring(c,c+len2);
				}
				else{
					flag=1;
				}
			}
			else{
				flag=1;
			}
		}
		if(op.equals(ip2)){
			System.out.println(c);
		}
		else if(flag==1){
			System.out.println("-1");
		}
	}
}
