package codeforces;
import java.util.*;

public class subtractopreation {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt(),k=in.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
			ar[i]=in.nextInt();
			
			
			//for(int i=0;i<n;i++)
		 System.out.println("case "+t);
			int i=0,j=n-1,count=0;
			while(i<j)
			{
			//	System.out.println(ar[i]+"Hello");
			
					//System.out.println(ar[j]-ar[i]);
				Arrays.sort(ar);
//				if(ar[0]>0)
//				{
//					System.out.println("ar[0]>0");
//				if((ar[j]-ar[i])<k)
//				{
//					i++;
//				}
//				else if((ar[j]-ar[i])>k)
//				{
//					j--;
//				}
//				 if((ar[j]-ar[i])==k)
//				{
//					count=1;
//					System.out.println("Yes");
//					break;
//				}
//				}
//				 if(ar[0]<0)
//				 {
//					 System.out.println("ar[0]<0");
//					 if((ar[j]-ar[i])<k)
//						{
//							j--;
//						}
//						else if((ar[j]-ar[i])>k)
//						{
//							i++;
//						}
//						 if((ar[j]-ar[i])==k)
//						{
//							count=1;
//							System.out.println("Yes");
//							break;
//						}
//						 System.out.println(ar[j]-ar[i]);	 
//				 }
			}
			if(count==0)
			{
				System.out.println("No");
			}
			t--;
			}
	}
	
}
