package codeforces;
import java.util.*;
public class EqualCandies {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			int min=100000000,sum=0;
			for(int i=0;i<n;i++)
			{
				ar[i]=in.nextInt();
				sum+=ar[i];
				if(min>ar[i])
					min=ar[i];
			}
			System.out.println(sum-(n*min));
			//System.out.println(sum+" "+min);
				
			t--;
		}
	
	}
}
