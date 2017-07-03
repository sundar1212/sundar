package guvi;
import java.util.Scanner;
public class Denomination {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int a;
		System.out.println("Enter the amount to be denominated");
		a=in.nextInt();
		int fi,fiv,hu,hun,fif,fift,te,ten,on,one;
		fi=a/500;
		fiv=a%500;
		hu=fiv/100;
		hun=fiv%100;
		fif=hun/50;
		fift=hun%50;
		te=fift/10;
		ten=fift%10;
		on=ten/1;
		one=ten%10;
		System.out.println(" 500rs="+fi+" 100rs="+hu+" 50rs="+fif+" 10rs="+te+" 1rupee="+on);
	}

}
