import java.util.*;
public class Player107 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ip=in.next();
		String sub=ip.substring(0,1);
		if(sub.equals("-")){
			System.out.println(ip.substring(1,ip.length()));
		}
		char a=ip.charAt(0);
		int a1=(int)a;
		if(a1>=48&&a1<=57){
			System.out.println(ip);
		}
		else{
			System.out.println("-1");
		}
	}
}
