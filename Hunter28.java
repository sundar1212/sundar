import java.util.*;
public class Hunter28 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the  String");
		String ip=in.next();
		int len=ip.length();
		ip=ip.toLowerCase();
		int[] asc=new int[200];
		String[] a1=ip.split("");
		Set a11=new TreeSet();
		for(int i=0;i<a1.length;i++){
			a11.add(a1[i]);
		}
		Iterator i1=a11.iterator();
		for(int i=0;i1.hasNext();i++){
			Object o1=i1.next();
			System.out.print(o1);
		}
	}
}
