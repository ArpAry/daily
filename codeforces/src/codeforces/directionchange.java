package codeforces;
import java.util.*;
public class directionchange {
	static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		
	}
	public static void main(String [] args){
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt(),m=in.nextInt();
			
			 if(n==1&&m>2||m==1&&n>2)
				System.out.println(-1);
			else if(n>m)
			{
				System.out.println(((2*n)-2)-(n+m)%2);
			}
			else 
			{
				System.out.println(((2*m)-2)-(n+m)%2);
			}
				
			t--;
		}
		
	}
	
}
