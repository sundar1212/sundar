package guvi;
import java.util.Scanner;
public class SimpleInterestCalc {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the principal,no.of years,rate of interest....");
		double pri=in.nextDouble();
		int n=in.nextInt();
		float roi=in.nextFloat();
		double total=(double) ((pri*n*roi)/100);
		System.out.println("SIMPLE INTEREST=Rs."+total);
	}
}
