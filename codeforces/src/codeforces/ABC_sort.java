package codeforces;
import java.util.*;
public class ABC_sort {
	public static void main()
	{
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++) {
				ar[i]=in.nextInt();
			}
			if((n&1)==1)
			{
				
			}
			else {
				for(int i=1;i<n;i+=2)
				{
					if(ar[i]>ar[i+1])
					{
						int b=ar[i];
						ar[i]=ar[i+1];
						ar[i+1]=b;
					}
				}
				
			}
			int count=0;
			for(int i=0;i<n-1;i++)
			{
				count=0;
				if(ar[i]<=ar[i+1])
				{
					count=1;
				}
				else
					break;
				//System.out.println(ar[i]);
			}
			if(count==1)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
	}
}
