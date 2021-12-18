package codeforces;
import java.util.*;
public class boyorgirl {
public static void main(String[] args)
{	
	Scanner in=new Scanner(System.in);
	String str=in.nextLine();
	int i,j,m=0,k=str.length(),sum=0;
	for(i=0;i<k;i++)
	{
		m=0;
		for(j=i+1;j<k;j++)
		{
		
			if(str.charAt(i)!=str.charAt(j))
			{
				m=1;
			}
			if(str.charAt(i)==str.charAt(j))
			{
				m=0;
				break;
			}
			
		}
		sum=sum+m;
		//System.out.println(sum);	
	}
	
	if((sum+1)%2!=0)
	{
		System.out.println("IGNORE HIM!");
	}
	else
	{
		System.out.println("CHAT WITH HER!");
	}
	
}
	
}
