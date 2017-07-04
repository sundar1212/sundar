package guvi;
import java.util.Scanner;
public class AreaFunction {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		System.out.println("1.Area of circle\n2.Area of Triangle\n3.Area  of rectangle");
		int choice=in.nextInt();
		
		switch(choice){
		case 1:
			System.out.println("Enter the radius of circle");
			double r=in.nextInt();
			double res1=areaCic(r);
			System.out.println("Area of Circle is="+res1);
			break;
			
		case 2:
			System.out.println("Enter the breadth & height");
			 double b=in.nextInt();
			 double h=in.nextInt();
			 double res2=areaTri(b,h);
			System.out.println("Area of triangle is="+res2);
			break;
		case 3:
			System.out.println("Enter the width & height");
			double w=in.nextInt();
			double h1=in.nextInt();
			double res3=areaRect(w,h1);
			System.out.println("Area of rectangle is="+res3);
			break;
			default:
				System.out.println("choose a valid option");
				}
		}

	private static double areaTri(double b, double h) {
		return (0.5*b*h);
	}

	private static double areaRect(double w, double h1) {
		return (w*h1);
	}
	private static double areaCic(double r) {
		return (3.14*r*r);
	}
	
}
