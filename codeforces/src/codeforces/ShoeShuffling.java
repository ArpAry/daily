package codeforces;
import java.util.*;
public class ShoeShuffling {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			int count=0;
			for(int i=0;i<n;i++)
			{
				ar[i]=in.nextInt();	
			}
			

			for(int i=0;i<(n-1);i++)
			{
				if(ar[i]==ar[i+1])
					count=1;
				else
				{
					count=0;
					break;
				}
					
			}
			
			if(count==0)
			{
//					if(n==1)
//						System.out.println(-1);
//					if(n==2)
//					{
//						if(ar[0]==ar[1])
//							System.out.println(ar[0]+" "+ar[1]);
//						else
//							System.out.println(-1);
//					}
//					if(n==3)
//					{
//						if(ar[0]==ar[1]&&ar[1]==ar[2])
//							System.out.println(ar[0]+" "+ar[1]+" "+ar[2]);
//						else
//							System.out.println(-1);
//					}
				if(n<4)
					System.out.println(-1);
				else if(n>=4)
				{
					if(ar[0]==ar[1]&&ar[n-1]==ar[n-2])
					{
						System.out.print(2+" "+1+" ");
						for(int i=3;i<=n-2;i++)
						{
							System.out.print((i)+" ");
						}
						System.out.print(n+" "+(n-1));
						
					}
					else
					{
						System.out.println(-1);
					}
				}
				
			}
			else
			{
				System.out.print(n+" ");
				for(int i=1;i<=n-1;i++)
				System.out.print(i+" ");
			}
			System.out.println();
			
			
			
			t--;
		}
	}
}
