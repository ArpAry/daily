package codeforces;
import java.util.*;
public class BankNotes {
	public static void main(String [] args)
	{
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			long k=in.nextLong();
			long ar[]= new long [n];
			long min[]= new long [n];
			for(int i=0;i<n;i++)
				{
					ar[i]=in.nextLong();
					ar[i]=(int)Math.pow(10,ar[i]);
			//		System.out.println(ar[i]);
				}
			//n=n+1;	
			for(int i=0;i<n-1;i++)
			{
				min[i]=(ar[i+1]/ar[i])-1;
		//		System.out.println(min[i]);
			}
			k++;
			long ans=0;
			for(int i=0;i<n&&k>0;i++)
			{
				//long x=k;
				k=k-min[i];
				if(k>0)
				{
					ans+=(min[i]*ar[i]);
				}
				else {
					ans+=((k+min[i])*ar[i]);
				}
				if(i==n-1)
				{
					//System.out.println("yes");
						ans+=((k*ar[i]));
				}
					
				//System.out.println(ans+"k "+k);
			}
			System.out.println(ans);
			t--;
		}
	}
}
