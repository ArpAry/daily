package codeforces;
import java.util.*;
public class plusoneonthesubset {

	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		long ar[][]=new long[n][50];
		int ar1[]=new int[100000];
		int i,j,k;
		for(i=0;i<n;i++)
		{
			ar1[i]=in.nextInt();
			
			for(j=0;j<ar1[i];j++)
			{
				ar[i][j]=in.nextInt();
			}
		}
		
		long max,min;
		for(i=0;i<n;i++)
		{
			 max=ar[i][0];
			 min=ar[i][0];
			
			for(j=0;j<ar1[i];j++)
			{
				if(ar[i][j]>max)
					max=ar[i][j];
				if(ar[i][j]<min)
					min=ar[i][j];
			}
			System.out.printf("%d\n",max-min);
		}
				
	}
}
