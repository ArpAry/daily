package codeforces;
import java.util.*;
public class babalance {
	public static void main (String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s1=in.nextLine();
			int n1=s1.length();
			int ab=0,ba=0;
			if(s1.charAt(0)!=s1.charAt(n1-1))
			{
				s1=s1.substring(0,n1-1)+s1.charAt(0);
			}
			
			//System.out.println(ab+" "+ba);

			System.out.println(s1);
			
			t--;
		}
	}

}
