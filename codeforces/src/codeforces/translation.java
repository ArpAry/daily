package codeforces;
import java.util.*;
public class translation {
	public static void main (String [] args)
	{
		Scanner in =new Scanner(System.in);
		String s1=in.nextLine() , s2=in.nextLine();
		int n1=s1.length(),n2=s2.length();
		//System.out.println(n1 +" "+n2);
		if(n1==n2)
		{int count=0;
			for(int i=0;i<n1;i++)
			{
				//char a1=s1.charAt(i),a2=s2.charAt(n1-i-1);
				if(s1.charAt(i)!=s2.charAt(n1-i-1))
				{	count=1;
					System.out.println("NO");
					break;
				}
				
			}
			if(count==0)
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
		
	}
	
}
