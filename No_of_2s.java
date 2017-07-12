import java.util.*;
public class No_of_2s {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the n value");
		int count=0;
		int n=in.nextInt();
	
		for(int i=0;i<=n;i++){
			int x=i;
			while(x!=0){
				int a;
				a=x%10;
				x/=10;
				if(a==2){
					count++;
				}
			}
		}
		in.close();
		System.out.println(count);
	}

}
