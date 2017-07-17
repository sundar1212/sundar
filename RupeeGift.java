import java.util.*;
public class RupeeGift {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the rupees");
		int[] rs=new int[4];
		for(int i=0;i<4;i++){
			rs[i]=in.nextInt();
		}
		System.out.println("Enter the budget of Sita");
		int bud=in.nextInt();
		Arrays.sort(rs);
		for(int i=0;i<4;i++){
			System.out.println(rs[i]);
		}
		int min=rs[0]+rs[1]+rs[2];
		if(min<bud){
			System.out.println("MINIMUM AMOUNT IS:"+min);
		}
		else{
			System.out.println("INVALID DATA");
		}
		int max=rs[3]+rs[2]+rs[1];
		if(max<bud){
			System.out.println("MAXIMUM AMOUNT IS:"+max);
		}
		else{
			System.out.println("INVALID DATA");
		}
	}

}
