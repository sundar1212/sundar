import java.util.*;
public class Player102 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			if(i!=1){
				System.out.println(i+" "+i);
			}
			else{
				System.out.println(i);
			}
		}
		for(int i=n-1;i>0;i--){
			System.out.println(i+" "+i);
		}
		System.out.println("1");
	}

}
