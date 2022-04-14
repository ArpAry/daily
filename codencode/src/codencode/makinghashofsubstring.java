package codencode;
import java.util.*;

public class makinghashofsubstring {
	
	static long inverse(long a,long m)
	{
		for(long x=1;x<m;x++)
			if(((a%m)*(x%m))%m==1)
			{	System.out.println(x);
			return x;
			}
		return  1;
	}
	
	public static void main(String [] args)
	{
		Scanner in =new Scanner(System.in);
		String s1=in.nextLine();
		int len=s1.length();
		//int n=in.nextInt();
		long dp[]=new long [len];
		long inv[]=new long [len];
		long p=27;
		long p_pow=1;
		long mod=100000007;
		dp[0]=s1.charAt(0)-'a'+1;
		inv[0]=1;
		for(int i=1;i<len;i++) {
			p_pow=(p_pow*p)%mod;
			inv[i]=inverse(p_pow,mod);
			dp[i]=(dp[i-1]+(s1.charAt(i)-'a'+1)*p_pow)%mod;		
		}
		for(int i=0;i<len;i++)
		{
		System.out.println(dp[i]+" "+inv[i]);	
		}
	}
	
}
