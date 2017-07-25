import java.util.*;
public class Player117 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ip=in.next();
		String rev=new StringBuffer(ip).reverse().toString();
		String op="";
		for(int i=0;i<ip.length();i++){
			String op1=rev.substring(i,i+1);
			op=op+op1+"-";
		}
		System.out.println(op.substring(0,op.length()-1));
	}

}
