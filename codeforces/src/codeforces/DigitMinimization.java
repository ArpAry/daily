package codeforces;
import java.util.*;
public class DigitMinimization {
	public static void main(String []args )
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt(),min=11;
		while(t>0)
		{
				int n=in.nextInt();
				min=11;
				if(n/100==0)
				{
					n=n%10;
					System.out.println(n);
				}
				else {
					while(n!=0)
					{
						min=Math.min(min,n%10);
						n=n/10;
						
					}
					System.out.println(min);
				}
				
							t--;
		}
	}}

