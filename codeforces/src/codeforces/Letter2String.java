package codeforces;
import java.util.*;
public class Letter2String {
	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			in.nextLine();
			String s1[]=new String[n];
			for(int i=0;i<n;i++)
			s1[i]=in.nextLine();
			
			long count=0;
			for(int i=0;i<n-1;i++)
			{
				char ch1=s1[i].charAt(0),ch2=s1[i].charAt(1);
			//	System.out.println("Hello world");
				for(int j=i+1;j<n;j++)
				{
					
					if(ch1==s1[j].charAt(0)&&ch2!=s1[j].charAt(1)||ch2==s1[j].charAt(1)&&ch1!=s1[j].charAt(0))
					{
						count++;
				//		System.out.println(s1[j]);
					}
					
				
				
//					if(ch2==s1[j].charAt(1)&&)
//					{
//						count++;
//					//	System.out.println(s1[j]);
//					}
				
				}
			}
			System.out.println(count);
			
			t--;
		}
	}
}
