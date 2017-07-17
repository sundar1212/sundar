
public class PossiblePalin {
	public static void main(String[] args){
	String s1="abcdemadambdc";
	String[] ne=new String[100];
	int len=s1.length();
	int y=2;
	int count=0;
	int s=1;
	int val=0;
	for(int j=0;j<len;j++){
	for(int i=0;i!=len-s;i++){
		ne[val]=(s1.substring(i,i+y));
		count++;
		val++;
	}
	s++;
	y++;
	}
	for(int i=0;i<count;i++){
		String n=new StringBuffer(ne[i]).reverse().toString();
		if(ne[i].equals(n)){
			System.out.println(ne[i]);
		}
	}
	
}
}
