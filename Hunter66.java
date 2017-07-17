import java.util.*;
public class Hunter66 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the no.of Strings");
		int n=in.nextInt();
		String[] ip=new String[n];
		System.out.println("Enter the Strings");
		for(int i=0;i<n;i++){
			ip[i]=in.next();
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(ip[i].length()>2){
			String s1=ip[i].substring(0,2);
			if(s1.equals("10")){
				count++;
			}
		}
		}
		System.out.println(count);
	}

}
