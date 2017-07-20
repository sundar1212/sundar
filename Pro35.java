import java.util.*;
public class Pro35 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the n value");
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			System.out.print("* ");
		}
		System.out.println("");
		String s1="";
		for(int i=1;i<n-1;i++){
			s1=s1+"  ";
		}
		for(int i=1;i<n-1;i++){
			System.out.println("*"+s1+" *");
		}
		for(int i=0;i<n;i++){
			System.out.print("* ");
		}
	}

}
