import java.util.*;
public class Find34 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the nth number");
		int n=in.nextInt();
		int op=0;
		for(int i=1;i<=n;i++){
			int a=i;
			String ip=String.valueOf(a);
			if (ip.matches("^[3-4]+$")) {
				System.out.println(ip);
				} 
		}
	}
}
