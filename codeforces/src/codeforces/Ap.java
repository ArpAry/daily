package codeforces;
import java.util.*;

public class makeAp {
	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		long ar[][]=new long[n][3];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<3;j++)
			{
				ar[i][j]=in.nextLong();
			}
		}
		for(i=0;i<n;i++)
		{
			long a,b,c;
			a=ar[i][0];
			b=ar[i][1];
			c=ar[i][2];
//			System.out.println(a);
//			System.out.println(b);
//			System.out.println(c);
			if((a+c)%(2*b)==0||(2*b-a)%c==0&&(2*b-a)>0||(2*b-c)%a==0&&(2*b-c)>0)
			{
				System.out.println("YES");
			}
			else
			{
				System.out.println("NO");
			}
			
		}
	}

}
