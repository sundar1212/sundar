package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class StockPriceGain {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int[] stc=new int[10];
		System.out.println("Enter the shares for 10 days");
		for(int i=0;i<=9;i++){
			stc[i]=in.nextInt();
		}
		Arrays.sort(stc);
		System.out.println("The maximum stock benefit is "+(stc[9]-stc[0]));
	}

}
