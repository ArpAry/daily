package codeforces;
import java.util.*;

public class makepowoftwo {
	public static void main(String [] args)
	{
		 Scanner in = new Scanner(System.in);
		 int t=in.nextInt();
		 in.nextLine();
		 while(t>0)
		 {
			 
			 String s1=in.nextLine();
			 int n1=s1.length();
			 long out=1000000001;
			 int ans=0;
			 long value=0;
			 //System.out.println(s1);
			 for(long i=1;i<Math.pow(2, 50);i=2*i)
			 {
				 String s2=Long.toString(i);
				 int n2=s2.length();
				 int count=0,sc=0,pc=0;
				 while(sc<n1&&pc<n2)
				 {
					 if(s1.charAt(sc)==s2.charAt(pc))
					 {
						 count++;
						 pc++;
					 }
					 sc++;
				 }
				 ans=n1-count+n2-count;
				 value=Math.min(out,n1+1);
				 System.out.println(ans+" "+value);
				out=Math.min(value, ans);
			 }
			 System.out.println(out);
			 
			 t--;
		 }
	}
	
}
