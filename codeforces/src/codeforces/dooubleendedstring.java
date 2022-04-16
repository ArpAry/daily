package codeforces;
import java.util.*;
public class dooubleendedstring {
	public static void main (String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s1=in.nextLine(),s2=in.nextLine();
			int n1=s1.length(),n2=s2.length();
			int ar[][]=new int[n1+1][n2+1];
			int max=0;
			for(int i=0;i<n1;i++)
			{
				for(int j=0;j<n2;j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
						{
							ar[i+1][j+1]=1+ar[i][j];
							if(max<ar[i+1][j+1])
								max=ar[i+1][j+1];
						}
					else
						ar[i][j]=0;
				}
			}
			if(2*max-n1-n2<0)
			System.out.println((2*max-n1-n2)*-1);
			else
				System.out.println(2*max-n1-n2);	
				
			t--;
		}
	}
	
}
