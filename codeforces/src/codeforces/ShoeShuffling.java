package codeforces;
import java.util.*;
class ShoeShuffling{
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			int ct[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=in.nextInt();
			}
			int k=0,count=1;
			for(int i=0;i<(n-1);i++)
			{
				if(ar[i]==ar[i+1]){
					count++;
					ct[k]=count;
				}
//				if(k==0&&count>0)
//					{
//						ct[k]=count;
//					}
				else {
					ct[k]=count;
					k++;
					count=1;
				}
			}
			int j=k;
			while(j>=0)
			{
				System.out.println("case "+ct[j]);
				j--;
				//ar[i]=in.nextInt();
			}
			
		
			t--;
		}
	}
	
}