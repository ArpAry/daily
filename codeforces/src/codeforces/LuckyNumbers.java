package codeforces;
import java.util.*;
public class LuckyNumbers {
	public static void main(String [] args )
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		long ans=0;
		for(int i=1;i<=n;i++)
		{
			ans+=(long)Math.pow(2, i);
		}
		System.out.println(ans);
	}
}
