package codeforces;
import java.util.*;
public class foodforanimal {
	public static void main(String [] args)
	{
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),x=in.nextInt(),y=in.nextInt();
			x=x-a;
			if(x<0)
				x=0;
			y=y-b;
			if(y<0)
				y=0;
//			if(x>0&&y>0)
//				System.out.println("1YES");
			
			{
				c=c-x-y;
				if(c>=0)
				System.out.println("YES");
				if(c<0)
					System.out.println("NO");
			}
		//	System.out.println(c);
			t--;
		}
	}
}
