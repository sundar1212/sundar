import java.util.*;
public class Player84 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ip=in.nextLine();
		String[] ips=ip.split(" ");
		for(int i=ips.length-1;i>=0;i--){
			System.out.print(ips[i]+" ");
		}
	}
}
