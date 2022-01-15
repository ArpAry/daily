package codeforces;
import java .util.*;

public class SPECIALPERMUATATION {

	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ar1[]=new int[n];
		int ar2[]=new int[n];
		int ar3[]=new int[n];
		int  i,j;
		for(i=0;i<n;i++)
		{
			ar1[i]=in.nextInt();
			ar2[i]=in.nextInt();
			ar3[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			int a=ar2[i];
			int b=ar3[i];
			int num=ar1[i];
			
//				if(num-b>=num/2||a+1>num/2)
//				{
//					
//				}
				if(a<=num/2&&num-b<num/2)
				{
				
					System.out.printf("%d ",a);
					for(j=num;j>(num/2)&&j!=b;j--)
					{
						System.out.printf("%d ",j);
					}
					System.out.printf("%d ",b);
					for(j=1;j<=(num/2)&&j!=a;j++)
					{
						System.out.printf("%d ",j);
					}
					System.out.println();
					
			    }
				else
				{
					System.out.println(-1);
				}
		}
	}
}
