package contest;
import java.util.*;
public class Everything {
	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			
			int count=0,n=in.nextInt();
			int sum=0;
			int ar[]=new int[n];
			for(int i=0;i<n;i++)
			{
				ar[i]=in.nextInt();
				sum+=ar[i];
			}
			for(int j=0;j<n;j++)
			{
				if((sum-ar[j])==(n-1)*ar[j])
				{
					count=1;
					System.out.println("Yes");
					break;
				}
			}
			if(count==0)
				System.out.println("No");
			
			t--;
		}
	}
}
