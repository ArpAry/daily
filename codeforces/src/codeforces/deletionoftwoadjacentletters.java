package codeforces;
import java.util.*;
public class deletionoftwoadjacentletters {
	public static void main(String [] args)
	{
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s1=in.nextLine();
			String s2=in.nextLine();
			//in.nextLine();
			int n1=s1.length(),count=0;
			//System.out.println(s1 +" "+s2);
			//if(n1%2==0)
			for(int i=0;i<n1;i++)
			{
				//System.out.println("YES");
				if(s1.charAt(i)==s2.charAt(0)&&i%2==0)
				{
					count=1;
					System.out.println("YES");
					break;
				}
				//System.out.println("NO");
			}
			if(count==0)
				System.out.println("NO");
			
			t--;
		}
	}
	
}
