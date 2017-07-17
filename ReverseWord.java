import java.util.*;
public class ReverseWord {
	public static void main(String[] args){
		String ip;
		Scanner in=new Scanner(System.in);
		ip=in.nextLine();
		String[] ip1=ip.split(" ");
			System.out.println(ip1[1]+" "+ip1[0]);
	}
}
