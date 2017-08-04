import java.util.*;
public class CardPointsResult {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a1=in.nextInt();
		int a2=in.nextInt();
		int a3=in.nextInt();
		int c=0;
		if(a1==a2&&a2==a3){
			System.out.println("TIE");
			c=1;
		}
		if(a1==a2&&c==0){
			System.out.println("Arun Balaji");
			c=1;
		}
		if(a2==a3&&c==0){
			System.out.println("Balaji Chandra");
			c=1;
		}
		if(a1==a3&&c==0){
			System.out.println("Arun Chandra");
			c=1;
		}
		if(a1>a2&&a1>a3&&c==0){
			System.out.println("Arun");
			c=1;
		}
		if(a2>a1&&a2>a3&&c==0){
			System.out.println("Balaji");
			c=1;
		}
		if(a3>a1&&a3>a2&&c==0){
			System.out.println("Chandra");
			c=1;
		}
		
	}
}
