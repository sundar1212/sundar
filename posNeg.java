public class posNeg{
	public static void main(String[] args){
		scanner in=new sacnner(System.in);
		int a;
		System.out.println("\n Enter the number..");
		a=in.nextInt();
		if(a<0)
		System.out.println("\n Negative num.");
		if(a>0)
		System.out.println("\n positive num.");
		if(a==0)
		System.out.println("\n Zero");
	}		
}