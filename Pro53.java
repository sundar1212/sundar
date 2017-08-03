import java.util.*;
public class Pro53 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the panagram");
		String ip=in.nextLine();
		String ips[]=ip.split(" ");
		int[] asc=new int[125];
		for(int i=0;i<ips.length;i++){
			for(int j=0;j<ips[i].length();j++){
				char temp=ips[i].charAt(j);
				int as=(int)temp;
				asc[as]++;
			}
		}int s=0;
		for(int i=97;i<=122;i++){
			if(asc[i]>=1){
				s=1;
			}
			else{
				s=0;
			}
		}
		if(s==1){
			System.out.println("This is a panagram");
		}
		else{
			System.out.println("Not a panagram");
		}
	}
}
