import java.util.*;
public class PrintStar {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String ip="";
		for(int i=0;i<n;i++){
			ip=ip+"*";
		}
		for(int i=0;i<n;i++){
			String ip1=ip.substring(i,n);
			System.out.println(ip1+" "+ip1);
		}
	}

}
