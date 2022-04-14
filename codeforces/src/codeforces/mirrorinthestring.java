package codeforces;
import java.util.*;
public class mirrorinthestring {
	public static void main(String [] args)
	{
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s1=in.nextLine();
			int n1=s1.length();
			//System.out.println(s1+" "+n1);
			if(n1==1)
			{
				System.out.println(s1+s1);
			}
			else
			for(int i=0;i<n1-1;i++)
			{
				char ar[] =new char[n1];
				if(s1.charAt(i)>s1.charAt(i+1))
				if(s1.charAt(i)==s1.charAt(i+1))
				{
					System.out.println(s1.substring(0,1)+s1.substring(0,1));
					break;
				}
				else if(s1.charAt(i)<=s1.charAt(i+1))
				{
					System.out.println(s1.substring(i,i+1));
					
				}
			}
			t--;
		}
		
	}
}
