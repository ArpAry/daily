package codeforces;
import java.util.*;
public class RoofConstruction {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		//int ar[]=new int[t];
		for(int i=0;i<t;i++)
		{
			int j=in.nextInt();
			if(j%2==0)
			{
				for(int k=1;k<j;k++)
				{
					System.out.print(k );
				}
			}
			else
			{
				for(int k=0;k<j;k++)
				{
					System.out.println(k);
				}
			}
			System.out.println();
		}
	}

}
