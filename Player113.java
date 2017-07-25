import java.util.*;
public class Player113 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ip=in.next();
		String i1=ip.substring(0,2);
		String i2=ip.substring(3,5);
		String i3=ip.substring(6,10);
	//	System.out.println(i1+" "+i2+" "+i3);
		int a1=Integer.parseInt(i1);
		int a2=Integer.parseInt(i2);
		if(ip.length()==10){
			if(a1>=1&&a1<=31){
				if(a2>=1&&a2<=12){
					System.out.println("true");
				}
				else{
					System.out.println("false");
				}
				
			}
			else{
				System.out.println("false");
			}
		}
		else{
			System.out.println("false");
		}
	}

}
