import java.util.*;
public class Player103 {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		for(int i=1;i<=n;i++){
			if(i==n){
				System.out.println(n);
				break;
			}
			else {
				System.out.println(i+" "+i);
			}
		}
		for(int i=n-1;i>0;i--){
			System.out.println(i+" "+i);
		}
	}
}
