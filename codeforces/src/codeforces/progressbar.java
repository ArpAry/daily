package codeforces;
import java.util.*;

public class progressbar {
	public static void  main(String[] args )
	{
		 Scanner in=new Scanner(System.in);
		 int n=in.nextInt();
		 int k=in.nextInt();
		 int t=in.nextInt();
		 int x=t*n/100;
		 int m=t*k*n/100,i;
		 int ar[]=new int[n];
		 for(i=0;i<x;i++)
		 {
			 if(i<x)
			 ar[i]=k;
			 
			
		 }
		 if(x!=n)
		 ar[i]=(m%k);
		 for(i=0;i<n;i++)
		 {
			 System.out.printf("%d ",ar[i]);
		 }
		 
		 
	}

}
