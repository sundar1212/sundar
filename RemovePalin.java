import java.util.*;
public class RemovePalin {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String ip=in.next();
		for(int i=0;i<ip.length();i++){
			String ne=ip;
			StringBuilder op=new StringBuilder(ne);
			op=op.deleteCharAt(i);
			String s2=String.valueOf(op);
			String n1=new StringBuffer(op).reverse().toString();
			String s1=String.valueOf(n1);
			if(s1.equals(s2)){
				System.out.println(op);
			}	
		}
	}

}
