package codeforces;
import java.util.*;
public class OddSubarrays {
	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
				ar[i]=in.nextInt();
			int j=0,count=0;
			while(j<(n-1))
			{
				if(ar[j]>ar[j+1])
				{
					j+=2;
					count++;
				}
				else
				{
					j++;
				}
			//	j--;
			}
			System.out.println(count);
			
			t--;
		}
	}
}
