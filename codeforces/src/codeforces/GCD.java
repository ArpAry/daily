package codeforces;
import java.util.*;
public class GCD {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		//long ar[]=new long [n];
		long ar1[]=new long [n];
		int i,j;
		for(i=0;i<n;i++)
		{
			ar1[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			long a,b;
			if(ar1[i]%2==0)
			{
				a=(ar1[i]-1)/2;
				b=(ar1[i]+1)/2;
				System.out.printf("%d %d 1\n",a,b);
			}
			else
			{
				if(ar1[i]%4==1)
				{
				a=(ar1[i]-2)/2;
				b=(ar1[i]+2)/2;
				System.out.printf("%d %d 1\n",a,b);
				}
				else if(ar1[i]%4==3)
				{
				a=(ar1[i]-4)/2;
				b=(ar1[i]+4)/2;
				System.out.printf("%d %d 1\n",a,b);
				}
				
			}
			//System.out.printf("1 %d 1\n",ar1[i]-2);
		}
	}

}
