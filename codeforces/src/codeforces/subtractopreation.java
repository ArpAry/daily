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
			Arrays.sort(ar);
			
			//for(int i=0;i<n;i++)
		 System.out.println("case "+t);
			int i=0,j=n-1,count=0;
			while(i<j)
			{
			//	System.out.println(ar[i]+"Hello");
				if(ar[i]>0)
				{
					System.out.println(ar[j]-ar[i]);
				if((ar[j]-ar[i])<k)
				{
					i++;
				}
				else if((ar[j]-ar[i])>k)
				{
					j--;
				}
				else if((ar[j]-ar[i])==k)
				{
					count=1;
					System.out.println("Yes");
					break;
				}
				}
				else
				{
					System.out.println(ar[j]-ar[i]);
					if((ar[i]-ar[j])<k)
					{
						i++;
					}
					else if((ar[i]-ar[j])>k)
					{
						j--;
					}
					else 
					{
						count=1;
						System.out.println("Yes");
						break;
					}
					
				}
			}
			if(count==0)
			{
				System.out.println("No");
			}
			t--;
		}
	}
	
}
