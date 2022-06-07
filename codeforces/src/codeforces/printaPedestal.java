package codeforces;
import java.util.*;
public class printaPedestal {
	
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			if(n%3==0)
			{
				n=n-3;
				int x=(n)/3;
				System.out.println((x+1)+" "+(x+2)+" "+x);
			}
			if(n%3==1)
			{
				n=n-4;
				int x=(n)/3;
				System.out.println((x+1)+" "+(x+3)+" "+x);
			}
			if(n%3==2)
			{
				n=n-5;
				int x=(n)/3;
				System.out.println((x+2)+" "+(x+3)+" "+x);
			}
			t--;
		}
	}
}
