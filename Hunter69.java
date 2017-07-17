import java.util.*;
public class Hunter69 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the e-mail id");
		String ip=in.next();
		int ati=0;
		int doti=0;
		int atcount=0;
		int dotcount=0;
		for(int i=0;i<ip.length();i++){
			String at=ip.substring(i,i+1);
			if(at.equals("@")){
				ati=i;
				atcount++;
			}
			if(at.equals(".")){
				doti=i;
				dotcount++;
			}
			}
		boolean ip1=ati>3;
		boolean ip2=atcount==1&&atcount!=0;
		boolean ip3=dotcount==1&&dotcount!=0;
		int mail=doti-ati;
		boolean ip4=mail==6;
		int len=ip.length();
		String op=ip.substring(len-4,len);
		boolean ip5=op.equals(".com");
		if(ip1&&ip2&&ip3&&ip4&&ip5){
			System.out.println("Valid mail id");
		}
		else{
			System.out.println("Invalid mail id");
		}
	}

}
