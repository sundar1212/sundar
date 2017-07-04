package guvi;
import java.util.Scanner;
public class Next20Leap {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the current year");
		int cryr=in.nextInt();
		for(int i=cryr+1;i<=(cryr+80);i++){
			if(i%4==0)
				System.out.println(i);
		}
	}
}
