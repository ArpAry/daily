package codeforces;
import java.util.*;
public class DoubleSort {
	static void bubble(int ar[])
	{
		int n=ar.length;
		for(int i=0;i<(n-1);i++)
		{
			for(int j=0;j<(n-1-i);j++)
			{
				if(ar[j]>ar[j+1])
				{
					ar[j]=ar[j]^ar[j+1];
					ar[j+1]=ar[j]^ar[j+1];
					ar[j]=ar[j]^ar[j+1];
				}
			}
			
		}
	//	return ar;
	}
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int a1[]=new int[n];
			int a2[]=new int[n];
			int b1[]=new int[n];
			int b2[]=new int[n];
			int c1[]=new int[n];
			int c2[]=new int[n];
		
			for(int i=0;i<n;i++)
				{					
					a1[i]=in.nextInt();
					a2[i]=a1[i];
				}
			for(int i=0;i<n;i++)
			{
				b1[i]=in.nextInt();
				b2[i]=b1[i];
			}
							
			bubble(a1);
			bubble(b1);
			int count=0,k=0,z=0;
			for(int i=0;i<n;i++)
			{
				
				for(int j=0;j<n;j++)
				{
					if(a2[i]==a1[j]&&b2[i]==b1[j])
					{
						if(i!=j)
						{
						c1[k]=i+1;
						c2[k]=j+1;
						k++;
						}
						else
							z++;
						count++;
					}
				}
				if(count==0)
				{
					System.out.println(-1);
					break;
				}
					
			}
			//System.out.println(count);
//			for(int i=0;i<n;i++)
//			{
//				System.out.println(a1[i]+" "+a2[i]+" "+b1[i]+" "+b2[i]);
//			}
			if(z==n)
				System.out.println("0");
			else if(k>0&&z!=n)
			{
				System.out.println(k);
				for(int i=0;i<k;i++)
				{
	//				System.out.println(a1[i]+" "+a2[i]+" "+b1[i]+" "+b2[i]);
			System.out.println(c1[i]+" "+c2[i]);
				}
			}
							t--;
		}
		
	}
}
