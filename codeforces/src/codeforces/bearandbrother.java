package codeforces;
import java.util.*;
public class bearandbrother {
	public static void main(String []args)
	{
		Scanner in =new Scanner (System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int ans=0;
		int i=1;
		while(a*i<=b*i)
		{
			 a=3*a;
			 b=2*b;
			i++;
		}
		System.out.println(i-1);
	}
}
