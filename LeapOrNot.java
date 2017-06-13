package guvi;
import java.util.Scanner;
public class LeapOrNot {
	public static void mian(String[] args){
		Scanner in=new Scanner(System.in);
		int yr;
		yr=in.nextInt();
		if(yr%4==0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not a Leap Year");
		}
	}
}
