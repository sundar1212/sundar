import java.util.*;
public class Hunter123 {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("enter the String");
		String ip=in.next();
		int len=ip.length();
	    in.close();
	    int[] asc=new int[200];
	    for(int i=0;i<len;i++){
	      char a=ip.charAt(i);
	      int a1=(int)a;
	      asc[a1]++;
	    }
	    for(int i=0;i<ip.length();i++){
	    	for(int j=0;j<129;j++){
	    		if(ip.charAt(i)==(char)j){
	    		    if(asc[j]==1){
	    		    	System.out.print(ip.charAt(i));
	    			}
	    		}
	    	}
	    }
	}
}
