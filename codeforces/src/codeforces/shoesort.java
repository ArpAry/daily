package codeforces;
import java.util.*;
public class shoesort {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			int ct[]=new int[n];
			int count=1,k=0;
			for(int i=0;i<n;i++)
				ar[i]=in.nextInt();	
			
			for(int i=0;i<(n-1);i++)
			{
				if(ar[i]==ar[i+1])
				{
					count++;
				}
				else if(ar[i]!=ar[i+1])
				{
					if(count==1)
						{
							System.out.println(-1);
							break;
				}
				else if(count>1)
					{
						ct[k]=count;
						k++;
						count=0;
					}
			
				}
			//	ar[i]=in.nextInt();	
			}
			for(int i=0;i<k;i++)
			{
				int j=2;
				while(j<ct[i])
				{
					System.out.print(j+" ");
			//		ct[i]--;
					j++;
				}
				System.out.print(1+" ");
				System.out.println();
			}
			if(k==0&&count!=1)
			{
				for(int i=2;i<=n;i++)
					System.out.print(i+" ");
				System.out.print(1+" ");
				System.out.println();
			}
			

		
			
			
			
			t--;
		}
	}
}
