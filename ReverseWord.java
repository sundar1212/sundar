import java.util.*;
public class ReverseWord {
	public static void main(String[] args){
		String ip;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		ip=in.nextLine();
		String[] ip1=ip.split(" ");
		for(int i=0;i<ip1.length;i++){
			String s1=new StringBuffer(ip1[i]).reverse().toString();
			ip1[i]=s1;
			i++;
		}
		for(int i=0;i<ip1.length;i++){
			System.out.print(" "+ip1[i]);
		}
			
	}
}
