import java.util.*;
public class Player110 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String ip1=in.next();
		String ip2=in.next();
		int len1=ip1.length();
		int len2=ip2.length();
		int count=0;
		int c=0;
		for(int i=0;i<len1;i++){
			String i11=ip1.substring(i,i+1);
			if(i11.equals("-")){
				c++;
			}
		}
		if(len1==len2){
			for(int i=0;i<len1;i++){
				String i1=ip1.substring(i,i+1);
				String i2=ip2.substring(i,i+1);
				if((i1.equals(i2))&&(i1.equals("-"))&&(i2.equals("-"))){
					count++;
				}
			}
		}
		if(c==count){
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE");
		}
	}
}
