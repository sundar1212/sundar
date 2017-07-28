import java.util.*;
public class Hunter13 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		LinkedList l1=new LinkedList();
		String ip="";
		System.out.println("Enter the number of characters");
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			l1.add(in.next());
		}
		Iterator i1=l1.iterator();
		while(i1.hasNext()){
			Object o1=i1.next();
			ip=ip+o1;
		}
		String op=new StringBuffer(ip).reverse().toString();
		if(ip.equals(op)){
			System.out.println("The characters in the list is a palindrome");
		}
		else{
			System.out.println("The characters in the list is not a palindrome");
		}
	}
}
