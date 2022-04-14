package codeforces;
import java.util.*;
public class stringLCM {
	
	static int  lcm (int n1,int n2 )
	{
		int a=n1,b=n2;
		while(n1%n2!=0) {
			int rem=(n1%n2);
			n1=n2;
			n2=rem;
		}
		return (a*b)/n2;
	}
	
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s1=in.nextLine();
			String s2=in.nextLine();
			String ns1="",ns2="";
			int n1=s1.length(),n2=s2.length();
	//		System.out.println(n1+" "+n2);
			if(n1==n2&&s1.equals(s2))
			{
				System.out.println(s1);
			}
			else
			{
				int lc=lcm(n1,n2);
				//System.out.println("th lcm is "+lc);
				for(int i=0;i<lc/n1;i++)
				{
					ns1=ns1+s1;
					//System.out.println(ns1);
				}
				for(int i=0;i<lc/n2;i++)
				{
					ns2=ns2+s2;
					//System.out.println(ns2+""+i);
				}
				if(ns1.equals(ns2))
				{
					System.out.println(ns1);
				}
				else
					System.out.println(-1);
				
			}
			
			
			t--;
		}
		
	
	}
	
}
