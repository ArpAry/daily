package codeforces;
import java.util.*;

public class longcomparisson {
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			long x1=0,x2=0;
			int p1=0,p2=0;
			 x1=in.nextLong();
			 p1=in.nextInt();
			 x2=in.nextLong();
			 p2=in.nextInt();
			int min=Math.min(p1,p2);
			p1-=min;
			p2-=min;
			if(p1>7)
			{
				System.out.println(">");
			}
			else if(p2>7)
			{
				System.out.println("<");
			}
			else
			{
				x1=x1*(int)Math.pow(10,p1);
				x2=x2*(int)Math.pow(10,p2);
				if(x1>x2)
					System.out.println(">");
				else if(x1<x2)
					System.out.println("<");
				else
					System.out.println("=");
			}
		//	System.out.println(x1+" "+p1+" "+x2+" "+p2+" ");
			t--;
		}

	}
	
}
	
	
	