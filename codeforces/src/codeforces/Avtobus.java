package codeforces;
import java.util.*;
public class Avtobus {
	public static void main(String []args)
	{
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			long n=in.nextLong(),m=n,min=0,max=0;
			//System.out.print(n);
			if(n%4==0||n%6==0||n%10==0)
			{
			 min=(n/6);
				n=n%6;
				min+=n/4;
				System.out.print(min+" ");
			}
			 if(m%4==0||m%6==0||m%10==0)
			{
				max=m/4;
				m=m%4;
				max+=m%6;
				System.out.printf("%d\n",max);
			}
			
			else
				System.out.println(-1);
			
			t--;
		}
	}
}
