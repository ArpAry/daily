package codeforces;
import java.util.*;

public class trianglesontherectangle {

	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int ar[][]=new int[n][2];
		int sol[]=new int[n];
		int i,j;
		int lh=0
		,uh=0
		,l=0
		,r=0
		;
		for(i=0;i<n;i++)
		{
			ar[i][0]=in.nextInt();
			ar[i][1]=in.nextInt();
//			int a[]=new int[n];
//			int b[]=new int[n];
//			int c[]=new int[n];
//			int d[]=new int[n];
		int a,b,c,d;
			a=in.nextInt();
			int ba[]=new int[a];
			for(j=0;j<a;j++)
			{
			ba[j]=in.nextInt();
			}
			lh=ba[a-1]-ba[0];
			lh=lh*ar[i][1];
			b=in.nextInt();
			int he[]=new int[b];
			for(j=0;j<b;j++)
			{
				he[j]=in.nextInt();
			}
			uh=he[b-1]-he[0];
			uh=uh*ar[i][1];
			c=in.nextInt();
			int le[]=new int[c];
			for(j=0;j<c;j++)
			{
				le[j]=in.nextInt();
			}
			l=le[c-1]-le[0];
			l=l*ar[i][0];
			d=in.nextInt();
			int ri[]=new int[d];
			for(j=0;j<d;j++)
			{
				ri[j]=in.nextInt();
			}
			r=ri[d-1]-ri[0];
			r=r*ar[i][0];
			if(lh>uh&&lh>l&&lh>r)
			{
				sol[i]=lh;
			//ystem.out.println(lh);
			}
			else 	if(uh>=	lh&&uh>l&&uh>r)
			{
				sol[i]=uh;
		//System.out.println(uh);
			}
			else 	if(l>uh&&l>lh&&l>=r)
			{
				sol[i]=l;
	//	System.out.println(l);
			}
			else {
				sol[i]=r;
	//	System.out.println(r);
			}
	//System.out.printf("%d %d %d %d ",a,b,c,d);
		}
		for(i=0;i<n;i++)
		{
			System.out.println(sol[i]);
		}
//ystem.out.printf("%d %d %d %d ",lh,uh,l,r);
	}
	
}
