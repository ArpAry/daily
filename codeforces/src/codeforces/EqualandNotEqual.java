package codeforces;
import java.util.*;

public class EqualandNotEqual {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int i,n,j,m=0;
		n=in.nextInt();
		in.nextLine();
		String [] str= new String [n];
		for(i=0;i<n;i++)
		{
			str[i]=in.nextLine();
		}
		
		for(i=0;i<n;i++)
		{
			m=0;
			for(i=0;i<n;i++)
			{
				m=0;
				for(j=0;j<str[i].length();j++) {
					if(str[i].charAt(j)=='N')
					{
						m++;
					}
				}
				if(m>1||m==0)
					System.out.println("YES");
				else
					System.out.println("NO");
				
			}
				
			}
		
		
	}

}
