package codeforces;
import java.util.*;

public class PainTheArray {
	static long gcd(long a ,long b)
	{
		if(b==0)
		return a;
		
		return gcd(b,a%b);
	}
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			long ar[] =new long[n];
			for(int i=0;i<n;i++)
				ar[i]=in.nextLong();
			 
			long g=ar[0];
			for(int i=2;i<n;i+=2)
				g=gcd(g,ar[i]);
	//		System.out.println(g);
			if(g>1)
			{
				int f=0,i;
				for(i=1;i<n;i+=2)
				{
					if(ar[i]%g==0)
					{
						f=1;
						break;
					}
				}
				if(f==0)
				{
					System.out.println(g);
					continue;
				}
			}
			g=ar[1];
			for(int i=3;i<n;i+=2)
				g=gcd(g,ar[i]);
			//System.out.println(g);
			if(g>1)
			{
				int f=0;
				for(int i=0;i<n;i+=2)
				{
					if(ar[i]%g==0)
					{
						f=1;
						break;
					}
				}
				if(f==0)
				{
					System.out.println(g);
					continue;
				}
			}
			System.out.println(0);
			t--;
		}
	}
}
