package codeforces;
import java.util.*;
public class SpecialNumbers {
	public static void main(String [] args)
	{
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt(),k=in.nextInt();
			long mod=1000000007,ans=0,j=1;
			while(k>0)
			{
				if((k%2)==1)
				{
					ans=(ans+j)%mod;
				}
				k=k/2;
				j=(j*n)%mod;	
			}

			System.out.println(ans);
			
			
			t--;
		}
		
;
		}
}
