package codeforces;
import java.util.*;
public class Avtobus {
	public static void main(String []args)
	{
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			long n=in.nextLong();
			n/=2;
			long m=n,min=0,max=0;
			//System.out.print(n);
			if(n%2!=0||n==2)
			{
				System.out.println("-1");
			}
			else
			{
				if(m%3==2||m%3==2)
				{
					min=(m/3)+1;
				}
				else {
					min=m/3;
				}
				
				max=n/2;
				
				System.out.println(min+" "+max);
				
			}
			
//			else
//				System.out.println(-1);
			
			t--;
		}
	}
}
