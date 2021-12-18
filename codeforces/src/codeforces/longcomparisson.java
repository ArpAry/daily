package codeforces;
import java.util.*;

public class longcomparisson {
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		long a=1,b=1,c=1,d=1,c1,c2;
		int i,j=0;
		int n=in.nextInt();
		long ar[][]=new long[n][4];
		for(i=0;i<n;i++)
		{
			for(j=0;j<4;j++)
			{
				ar[i][j]=in.nextLong();
			}
		}
		for(i=0;i<n;i++)
		{
		
					j=0;
					a=ar[i][j];
					j++;
					b=ar[i][j];
					c1=a*(int)Math.pow(10, b);
					j++;
					c=ar[i][j];
					j++;
					d=ar[i][j];
					c2=c*(int)Math.pow(10, d);
					if(c1>c2)
					{
						System.out.println(">");
					}
					else if(c1<c2)
					{
						System.out.println("<");
					}
					else  if(c1==c2)
					{
						System.out.println("=");
					}
				
				
			
		}
	}
		}
	