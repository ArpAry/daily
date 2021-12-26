package codeforces;
import java .util.*;

public class SQUARESANDCUBES {
	public static void main(String [] args)
	{
		Scanner in= new Scanner(System.in);
		int n=in.nextInt();
		//in.nextLine();
		long ar[]=new long[20];
		int i,j;
		double f;
		double s,c,h;
		for(i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			s=Math.floor(Math.sqrt(ar[i]));
			c=Math.floor(Math.cbrt(ar[i]));
			h=Math.floor(Math.sqrt(Math.cbrt(ar[i])));
			f=s+c-h;
			System.out.printf("%.0f\n",f);
		}
		
	}

}
