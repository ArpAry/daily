package codeforces;
import java.util.*; 
public class makeIT_INcreasing {
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
			
			int  j=n-1,z=0,count=0;
			for(j=n-2;j>=0;j--)
			{
				while(ar[j]!=0&&ar[j]>=ar[j+1])
				{
					ar[j]=ar[j]/2;
					count++;
				}
				if(ar[j]==ar[j+1])
				{
					z=1;
					System.out.println(-1);
					 break;
				}
			}
			if(z==0)
				System.out.println(count);
		
			t--;
		}
	}
}
