import java.util.*;
public class Pro62 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the string");
		String ip=in.next();
		String sub="";
		int len1=sub.length();
		int len2=0;
		String op="";
		for(int i=0;i<ip.length();i++){
			for(int j=i+1;j<ip.length();j++){
				sub=ip.substring(i,j);
				len2=sub.length();
				String n1=new StringBuffer(sub).reverse().toString();
				if(n1.equals(sub)&&(len2>len1)){
					op=n1;
					len1=len2;
				}
			}
		}
		System.out.println(op);
	}

}
