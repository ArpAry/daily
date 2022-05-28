package codeforces;
import java.util.*;
public class circularLocalMiniMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			int br[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				ar[i]=in.nextInt();
			}
			if((n&1)!=0)
			{
				System.out.println("NO");
			}
			else {
//				
				Arrays.sort(ar);
				int k=0;
				for(int i=0;i<n/2;i++)
				{
					br[k]=ar[i];
					k++;
					br[k]=ar[i+n/2] ;
					k++;
				}
				int count =1;
				
				for(int i=0;i<n-1;i++)
				{
					if(br[i]<br[i+1]&&(i&1)==0)
						count=0;
					else if(br[i]>br[i+1]&&(i&1)!=0)
						count=0;
					else 
					{
						count=1;
						System.out.println("NO");
						break;
					}
						
				}
				
//				for(int i=0;i<n;i++)
//		 			System.out.printf("%d ",br[i]);
					if(count==0)
					{
						if(br[n-1]<br[0])
						{
							System.out.println("NO");
						}
						else
					 	{
					 		System.out.println("YES");
					 		for(int i=0;i<n;i++)
					 			System.out.printf("%d ",br[i]);
					 		System.out.println();
					 	}
					}
			}
			t--;
		}
	}

}
