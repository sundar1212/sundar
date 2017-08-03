import java.util.*;
public class Pro60 {
	public static void main(String[] args) {
		Scanner  in =new Scanner (System.in);
		System.out.println("Enter the array size");
		int s=in.nextInt();
		System.out.println("Enter the time t");
		int t=in.nextInt();
		int[] a=new int[s];
		int temp=3;
		int sta=temp;
		a[1]=temp;
		for (int i=2;i<s;i++) {
			if(temp!=1){
			a[i]=temp-1;
			temp--;
			//System.out.println(i+"  "+a[i]);
			}
			else{
				temp=sta*2;
				sta=temp;
				a[i]=temp;
				//System.out.println(i+" "+a[i]);
			}
		}
		for(int i=0;i<s;i++){
			if(a[i]==t){
				System.out.println(i);
				break;
			}
		}
		
	}

}
