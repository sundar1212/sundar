package guvi;
import java.util.Scanner;
public class WorkingDay {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		String ip;
		System.out.println("Enter the 1st 3 letters of the day");
		ip=in.next();
		if((ip.equals("sun"))||(ip.equals("sat"))){
			 System.out.println("false");
		}
		else if((ip.equals("mon"))||(ip.equals("tue"))||(ip.equals("wed"))||(ip.equals("thu"))||(ip.equals("fri"))){
			System.out.println("true");
		}
		else{
			System.out.println("!!!Enter a valid day!!!");
		}
	}

}
