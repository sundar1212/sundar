import java.util.*;
public class FirstOccurString {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of Strings");
		int n=in.nextInt();
		String[] ip=new String[n];
		for(int i=0;i<n;i++){
			ip[i]=in.next();
		}
		for(int i=0;i<n;i++){
			int len=ip[i].length();
			if(len==1){
				System.out.println(ip[i]);
				i=n;
			}
		}
	}

}
