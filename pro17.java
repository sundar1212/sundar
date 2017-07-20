import java.util.*;
public class pro17 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number to find its seeds");
		int a=in.nextInt();
		int len=(int) (Math.log10(a)+1);
		int aa=1;
		int num=a;
		for(int i=1;i<a;i++){
			int pro=1;
			num=i;
			while(num!=0){
				aa=num%10;
				num=num/10;
				pro=pro*aa;
				//System.out.println("rem"+" "  +aa);
				//System.out.println("product "+pro);
			}
			int total=i*pro;
			//System.out.println("total "+total);
			if(total==a){
				System.out.println("Seed of "+a+" is "+i);
			}
		}
		
		
	}
	}
