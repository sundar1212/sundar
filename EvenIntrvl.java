package guvi;
import java.util.Scanner;
public class EvenIntrvl {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Range");
		int s=in.nextInt();
		int e=in.nextInt();
		for(int i=s;i<=e;i++){
			if(i%2==0){
				System.out.print(" "+i);
			}
		}
	}

	}


