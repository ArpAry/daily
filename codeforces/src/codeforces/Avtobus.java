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
			if(n<4||(n&1)!=0)
				System.out.println(-1);
			else
			{
				n/=2;
				
				if((n%3)==0)
					System.out.println(n/3);
				else 
					System.out.println(n/3+1);
				
				System.out.println(n/2);
			}
			
			t--;
		}
	}
}
