package codeforces;
import java.util.*;
public class ConsecutivePointesSegment {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
				ar[i]=in.nextInt();
			
			Arrays.sort(ar);
			boolean can=true;
			int count=0;
			for(int i=0;i<n-1;i++)
			{
//				int count=0;
				int gap=ar[i+1]-ar[i];
				if(gap==1)
					continue;
				else if(gap==2)
				{
					count++;
					if(count>1)
					{
						System.out.println("NO");
//						System.out.println(t+"NO1");
						break;
					}
					
				}
				else if(gap==3)
				{
					if(count>1)
					{
						System.out.println("NO");
					//	System.out.println(t+"NO2");
						break;
					}
					else
					{
						count++;
						continue;
					}
				}
				else {
					System.out.println("NO");
//					System.out.println(t+"NO3"+count);
					count=gap;
					break;
				}			
			}
			if(count<=1)
				System.out.println("YES");
				//System.out.println(t+"YES4");
//			if(can)
//				System.out.println("YES"+(t));
			t--;
		}
	}
}
