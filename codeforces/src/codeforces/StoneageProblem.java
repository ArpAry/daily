package codeforces;
import java.util.*;
public class StoneageProblem {

	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt(),q=in.nextInt();	
		int ar[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
			sum+=ar[i];
		}
		int tprev=0,xprev=0;
		int first=q;
		while(q>0)
		{
			
		int t=in.nextInt();
		int pos=0,x=0;
		if(t==1)
		{
			pos=in.nextInt();
			x=in.nextInt();
		}
		else
		{
			 x=in.nextInt();
		}
		
		if(t==1)
		{
			
			if(q==first)
			{
				xprev=ar[pos-1];
			}
			if(tprev==1||tprev==0)
			{	
//				if(q==5)
//				System.out.println(xprev+" "+x+" "+sum);
				sum=sum-ar[pos-1]+x;
				ar[pos-1]=x;
			}
			
			 if(tprev==2)
			{
				 
				sum=sum-xprev+x;	
			}
			//if(q==3)
			// System.out.println("q=3"+ xprev);
			//	sum=sum-xprev+x;
		}
		else if(t==2)
		{
			sum=x*n;
		}
		xprev=x;
		tprev=t;
		System.out.println(sum);
		q--;
		}	
	}
}
