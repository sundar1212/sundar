package oops;
class Calculator{
	static double powerInt(int a1,int a2){
		return(Math.pow(a1,a2));
	}
	static double powerDouble(double a3,int a4){
		return(Math.pow(a3,a4));
	}
}
public class Calc {
	public static void main(String[] args){
		double a;
		double b;
		a=Calculator.powerInt(10,2);
		b=Calculator.powerDouble(500,2);
		System.out.println("Power int= "+a);
		System.out.println("Power double= "+b);
	}
}
