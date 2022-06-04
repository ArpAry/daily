package codeforces;
import java.util.*;
public class EatingQueries {
	static void mincandy (int n,int ar[])
	{
		//Arrays.sort(ar);
		
		
	}
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt(),min=987654321,max=0;
			int nc=in.nextInt();
			int ar[]=new int[n];
			int str[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=in.nextInt();
			}
			Arrays.sort(ar);
			max=ar[n-1];
			for(int i=n-2;i<=0;i--)
			{
				max+=ar[i];
				ar[i]=max;
			}
			int numreq=0;
			for(int j=0;j<nc;j++)
			 {
				numreq=in.nextInt();
				if(numreq<=ar[0])
				{
					System.out.println(1);
				}
				else if(numreq>max)
				{
					System.out.println(-1);
				}
				else
				{
					int fi=0,lst=n,mid=(lst+fi)/2,count=1;
					while(fi<=lst) {
						mid=(fi+lst)/2;
					if(numreq<=ar[mid])
					{
						lst=mid-1;
						count=mid;
					}
					else {
						fi=mid+1;
					//	count=mid;
						//count++;
					}
					
					System.out.println(fi+1);
				}	
					}
				
					
			 }
			
			t--;
		}
	}
}
