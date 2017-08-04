import java.util.Scanner;

public class SkillFootball {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int r=in.nextInt();
		int c=in.nextInt();
	    long[][] a=new long[r][c];
		    for (int i = 0; i < r; i++)
		        a[i][0]=1;
		    for (int j = 0; j < c; j++)
		     a[0][j]=1;	  
		  
		    System.out.println(" ");
		    for (int i = 1; i < r; i++)
		    {
		        for (int j = 1; j < c; j++){
		            a[i][j] = a[i-1][j] + a[i][j-1]; 
		      // System.out.println(i+" "+j+" "+a[i][j]);
		        }
	}
		 /*   for (int i = 0; i < r; i++)
		    {
		    	System.out.println(" ");
		        for (int j =0; j < c; j++){
		            
		        System.out.print(" "+a[i][j]);
		        }
	}*/
		    System.out.println(a[r-1][c-1]);
	}
}
