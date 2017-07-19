import java.util.*;
public class Pro1a {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the no.of Strings");
		int n=in.nextInt();
		String[] ip=new String[n];
		System.out.println("Enter the "+n+" "+" inputs without spaces");
		for(int i=0;i<n;i++){
			ip[i]=in.next();
		}
		String op="";
		int a=0;
		String op1="";
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=j)
				for(int k=0,k1=0;k<ip[i].length()&&k1<ip[j].length();k++,k1++){
					String ip1=ip[i].substring(0,k);
					//System.out.println(" "+ip1);
					String ip2=ip[j].substring(0,k1);
					//System.out.println(" "+ip2);
					if(ip1.equals(ip2)){
						if((ip[i].contains(ip1))&&(a==0)&&(ip[j].contains(ip1))){						
							op=ip1;
							op1=op;
						}
					}
				}
			}
			a=1;
		}
		System.out.println(op);
	}

}
