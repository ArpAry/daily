package codeforces;
import java.util.*;
public class profSlim {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
				ar[i]=in.nextInt();
			int i=0,j=n-1;
			while(i<j)
			{
				if(ar[i]>0&&ar[j]<0)
				{
					ar[i]=-ar[i];
					ar[j]=-ar[j];
				}
				else if(ar[i]<0)
				{
					i++;
				}
				else if(ar[j]>0)
					 j--;
				
			}
			int z=0;
			for( z=0;z<n-1;z++)
			{
				if(ar[z]>ar[z+1])
				{
					System.out.println("NO");
					break;
				}
			}
			if(z==n-1)
			{
				System.out.println("YES");
			}
			t--;
		}
	}
	
}
