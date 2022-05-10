package codeforces;
import java.util.*;
public class maximalAnd {
	public static void main (String [] args)
	{
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int ans=0,count=0;
			int n=in.nextInt(),k=in.nextInt();
			int ar[] =new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=in.nextInt();
			}
			for(int j=30;j>=0;j--)
			{
				count=0;
				for(int i=0;i<n;i++)
				{

					Boolean z=true;
					if((ar[i]&(1<<j))>0)
					{
						z=true;
					}
					else
					{
						z=false;
					}
					
					if( z==true)
					{	
						//System.out.println(j);
						count++;
					}
					//System.out.println(ar[i]);
				}
				count=n-count;
				if(count<=k)
				{
					ans+=(1<<j);
					k-=count;
				}			
			}
			System.out.println(ans);
			
			t--;			
		}
	}
}
