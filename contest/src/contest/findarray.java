package contest;
import java.util.*;
public class findarray {
public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int n=in.nextInt();
		int ar[] =new int [n];
		int  j;
		int i;
		//int prime[]=new int [100000]; 
		for(i=0;i<n;i++)
		{
			ar[i]=in.nextInt();
		}
		for(i=0;i<n;i++)
		{
			if(ar[i]==1)
			{
				System.out.println("1\n");
			}
			else 
			{	
			for(j=2;j<=ar[i]+1;j++)
			{
				System.out.printf("%d ",j);
			}
			System.out.printf("\n");
			}
		}
		
		
		
	}
}
