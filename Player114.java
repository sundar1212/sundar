import java.util.*;
public class Player114 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ip1=in.next();
		String ip2=in.next();
		if(ip1.length()==ip2.length()){
			System.out.println(ip1+ip2);
		}
		else{
			int l1=ip1.length();
			int l2=ip2.length();
			if(l1<l2){
				String ipp=ip2.substring(l2-l1,l2);
				System.out.println(ipp+ip1);
			}
			else{
				String ipp=ip1.substring(l1-l2,l1);
				System.out.println(ipp+ip2);
			}
		}
	}

}
