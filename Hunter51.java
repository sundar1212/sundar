import java.util.*;
public class Hunter51 {
	public static void main(String[] args) {
		Scanner  in = new Scanner ( System.in );
		System.out.println("Enter the no of elements");
		int a1=in.nextInt();
		int[][] a=new int[a1][2];
		for (int i = 0; i <a1; i++) {
			for(int j=0;j<2;j++){
				//System.out.println(i+ " "+j);
				a[i][j]=in.nextInt();
			}
		}
		
		for (int i=0; i<a1; i++) {
			    for(int j=0;j<1;j++){
			    	System.out.println((a[i][j]*a[i][j+1])-1);
			    }
		}
	}
}
