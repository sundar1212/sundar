package guvi;
import java.util.Scanner;
public class VowelOrNot {
	public static void main(String[] args){
		String ip;
		Scanner in=new Scanner(System.in);
		ip=in.next();
		char a=ip.charAt(0);
		if((a=='a'||a=='e'||a=='i'||a=='o'||a=='u')||(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')){
			System.out.println("It is an Alphabet");
		}
		else{
			System.out.println("It is a Consonant");
		}
	}

}
