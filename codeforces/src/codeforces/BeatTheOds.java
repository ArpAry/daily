package codeforces;
import java.util.*;
public class BeatTheOds {
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
			int evct=0,odct=0;
			for(int i=0;i<(n);i++)
			{
				if((ar[i]&1)!=0)
				{
					odct++;
					//i++;
				}
				 if((ar[i]&1)==0)
				{
					evct++;
				//	i++;
				}			
			}
			if(evct>=odct)
				System.out.println(odct);
			else 
				System.out.println(evct);
			
				
			
			t--;
		}
	}

}
