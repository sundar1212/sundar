import java.util.*;
public class Hunter67 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		ArrayList a1=new ArrayList();
		System.out.println("Enter the n value");
		int n=in.nextInt();
		for(int i=0;i<n;i++){
			a1.add(in.next());
		}
		int[] sum=new int[n];
		String[] ip1=new String[3];
		int y=0;
		Iterator<String> it1=a1.iterator();
		while(it1.hasNext()){
			int x=1;
			Object o1=it1.next();
			ip1=((String) o1).split("#");		
			int a=Integer.parseInt(ip1[x]);
			int b=Integer.parseInt(ip1[x+1]);
			int c=Integer.parseInt(ip1[x+2]);
			sum[y]=a+b+c;
			x++;
			//System.out.println(sum[y]);
			y++;
	}
		int max=0;
        for(int i = 0; i < n; i++){
            if(max < sum[i]){
                max =i;
            }
        }
		//System.out.println(max);
		String name=(String) a1.get(max);
		String[] nm=new String[4];
		nm=name.split("#");
		System.out.println(nm[0]);
	}
}
