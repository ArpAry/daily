package codeforces;
import java.util.*;
public class Homework {
	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int a=in.nextInt(),b=in.nextInt(),c=in.nextInt(),d=in.nextInt();
			int max=a+b+c-3;
			int min=0;
			if(a>=b&&a>=c)
				min=a-b-c-1;
			else if(b>=a&&b>c)
				min=b-a-c-1;
			else
				min=c-a-b-1;
			if(d>=min&&d<=max)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
	}
}
