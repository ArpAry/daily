package codeforces;
import java.util.*;

public class antilightcellguessing {

	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int ar[][]=new int [n][2];
		int i,j;
		for(i=0;i<n;i++)
		{
			for(j=0;j<2;j++)
			{
				ar[i][j]=in.nextInt();
			}
		}
		
		for(i=0;i<n;i++)
		{
			int a,b;
			a=ar[i][0];
			b=ar[i][1];
			if(a==1&&b==1)
			{
				System.out.println(0);
			}
			else if(a==1||b==1)
			{
				System.out.println(1);
			}
			else
			{
				System.out.println(2);
			}
		}
		
		
		
	}
}
