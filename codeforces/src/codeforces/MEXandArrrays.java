package codeforces;
import java.util.*;
public class MEXandArrrays {
	public static void main (String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
				ar[i]=in.nextInt();
			int ans=0;
			for(int i=0;i<n;i++)
			{
				
				for(int j=i;j<n;j++)
				{
					ans+=j-i+1;
					for(int k=i;k<=j;k++)
					if(ar[k]==0)
						ans++;
					
				}
			}
			System.out.println(ans);
			t--;
		}
	}
}
