package codeforces;
import java.util.*;
public class squarestring {

	public static void main(String [] args)
	{
		Scanner in =new Scanner(System.in);
		int n=in.nextInt();
		String [] str=new String[n];
		in.nextLine();
		int i,j,k,m,z=1;
		for(i=0;i<n;i++)
		{
			str[i]=in.nextLine();
		}
		
		for(i=0;i<n;i++)
		{
			
			//System.out.println(i);
			z=1;
			k=str[i].length();
		//	System.out.println(k);
			if(k%2!=0)
			{
			    z=10;
				System.out.println("NO");
			
			}
		
			for(j=0;j<k/2;j++)
			{	
				if(z==10)
				{
					break;
				}
				else
				{
					z=0;
				    m=k/2;
					if(str[i].charAt(j)==str[i].charAt(m+j))
					{
						z=3;
						
						//System.out.println(m);
						
					}
					else
					{
						System.out.println("NO");
						break;
					}
					
				// m++;
			  }
			
		}
			if(z==3)
				System.out.println("YES");
			    
		}
		
		
	}
}