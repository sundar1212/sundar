import java.util.*;
public class Pro65 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String option="";
		boolean b = false;
		String[][] ticket=new String[4][10];
		for(int i=0;i<4;i++){
			for(int j=0;j<10;j++){
				ticket[i][j]="A";
			}
		}
		do{
			System.out.println("A=Availability");
			System.out.println("B=Booked");
			System.out.println("The seating available are");
			System.out.println("   R0"+"  "+"R1"+" "+"      R2"+" "+"  R3");
			for(int i=0;i<10;i++){
				System.out.print("cl"+i+" ");
				System.out.println(ticket[0][i]+"  "+ticket[1][i]+"\t "+ticket[2][i]+"   "+ticket[3][i]);
			}
			for(int i=0;i<4;i++){
				for(int j=0;j<10;j++){
					if(ticket[i][j].contentEquals("B")){
						b=true;
					}
					else{
						b=false;
					}
				}
			}
			if(b==false){
			System.out.println("How many Seats you need to book?");
			int n1=in.nextInt();
			System.out.println("TOTAL AMOUNT="+(n1*1200));
			for(int i=0;i<n1;i++){
				System.out.println("Enter your name:");
				String name=in.next();
				System.out.println("Enter the mobile number:");
				String num=in.next();
				int len=num.length();
				if(len!=10){
					System.out.println("Enter a valid mobile number");
					break;
				}
				System.out.println("Enter your credit card number...");
				String acc=in.next();
				System.out.println("Enter the ccv number");
				String ccv=in.next();
				System.out.println("Enter the row and column number");
				int row=in.nextInt();
				int col=in.nextInt();
				if(ticket[row][col].equals("A")){
					ticket[row][col]="B";
					System.out.println("Ticket booked successfully");
					System.out.println("Retain the sms carefully untill you check in...");
				}
				else if(ticket[row][col].equals("B")){
					System.out.println("Seat number "+"r"+row+" "+"c"+col +" Already Booked");
				}
				else{
					System.out.println("OOOPPSSSS!!! There is no such seat number available . ");
				}
			}
			
			for(int i=0;i<10;i++){
				System.out.print("cl"+i+" ");
				System.out.println(ticket[0][i]+"  "+ticket[1][i]+"\t "+ticket[2][i]+"   "+ticket[3][i]);
			}
			System.out.println("Do you need to continue Y or N");
			option=in.next();
			option=option.toUpperCase();
			}
			else if(b==true){
				System.out.println("SORRY NO SEATS AVAILABLE...!!! ");
			}
		}while(option.equals("Y"));
	}
}
