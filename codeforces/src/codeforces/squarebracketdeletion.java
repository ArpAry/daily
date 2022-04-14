package codeforces;
import java .util.*;
public class squarebracketdeletion {

	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		
		while(t>0)
		{	//System.out.println(t);
			int n1=in.nextInt();
			in.nextLine();
			String s1=in.nextLine();
			int o=0,c=0;
			int i=0,j=0;
			for( i=0;i<n1;)
			{
				if(s1.charAt(i)=='(')
				{
					if(i==n1-1)
					{
						i++;
						c++;
					}
					else 
					{
						i+=2;
						o++;
					}
				}
				else
				{	int f=0;
					for(j=i+1;j<n1;j++)
					{
						if(s1.charAt(j)==')')
						{
							o++;
							f++;
							i=j+1;
							break;
						}
					}
					if(f==0)
					{
						c=n1-i;
						break;
					}
				}
			}
			System.out.println(o+" "+c);
			
			t--;
		}
	}
}
