import java.util.*;
public class Pro59 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the total number of coins");
		int n=in.nextInt();
		System.out.println("Who takes the first coin 1)A 2)B(choice 1 or 2)");
		int play=in.nextInt();
		if((n%2==0)&&((play==1)||(play==2))){
			System.out.println("Both have equal value");
		}
		else if((n%2!=0)&&(play==1)){
			System.out.println("A has maximum value");
		}
		else if((n%2!=0)&&(play==2)){
			System.out.println("B has maximum value");
		}
	}
}
