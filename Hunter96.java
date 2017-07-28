import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Hunter96 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ip=in.next();
		int[] asc=new int[130];
		String op="";
		for(int i=0;i<ip.length()-1;i++){
			String ips=ip.substring(i,i+1);
			char a1=ips.charAt(0);
			int a2=(int)a1;
			if(a2==97){
				a2=122;
				a1=(char)a2;
			}
			else{
			a2=a2-1;
			a1=(char)a2;
			}
			op=op+a1;
		}
		op=op+ip.charAt(ip.length()-1);
		System.out.println(op);
	}
}
