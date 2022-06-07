package codeforces;
import java.util.*;
public class ArrayDecrements {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			int br[]=new int[n];
			for(int i=0;i<n;i++)
				ar[i]=in.nextInt();
			for(int i=0;i<n;i++)
				br[i]=in.nextInt();
			int count=0,diff=0;
			diff=ar[0]-br[0];
			for(int i=1;i<n;i++)
			{
				int x=(ar[i]-br[i]);
//				if(x<=diff&&(ar[i]-br[i])>0)
//				{
//					count=0;
//					//System.out.println(ar[i]+"bfjew"+br[i]+"fbkjas");
//					//System.out.println("NO");
//				//	break;
//				}
				if(x>diff)
				{
					count=1;
					
						break;
				}
				else if(ar[i]<br[i])
					{
						count=1;
						break;
					}
				else 
					count=0;
			}
			 if(count==1||diff<0)
			 {
					System.out.println("NO");
					
			 }
			 else if(count==0)
				System.out.println("YES");
			
				 
			
		}
	}
}
