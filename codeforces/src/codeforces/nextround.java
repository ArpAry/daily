package codeforces;
import java.util.*;
public class nextround {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n,k;
		n=in.nextInt();
		k=in.nextInt();
		int  ar[]=new int[n];
		int i,x,j=0;
		for(i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
				x=ar[k-1];
				
				for(i=0;i<n;i++)
				{
					if(ar[i]>=x&&ar[i]>0)
					{
						j++;
					}
				}
			
		System.out.println(j);
	}

}
