package codeforces;
import java.util.*;

public class missingbigram {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int ar[]=new int [n];
	int i=0;
	String str[]=new String[n];
	for (i=0;i<n;i++)
	{
		ar[i]=in.nextInt();
		in.nextLine();
		str[i]=in.nextLine();
	}
	
	
//	for(i=0;i<n;i++)
//	{
//		
//	}
	int j=0;
	int cmp;
	
	
	for(i=0;i<n;i++)
	{
		int z=0;
		String str2="";
		
	if(ar[i]==3)
		{
		 cmp=3;
		}
	else if(ar[i]==5)
	{
		cmp=8;
	}
	else
		{
		cmp=(2*ar[i])-1;
		}
			str2=""+str[i].charAt(0);
		for(j=1;j<cmp&&j<ar[i];j+=2)
		{
				if(str[i].charAt(j)==str[i].charAt(j+2))
				{
					//System.out.println(j);
					str2=str2+str[i].charAt(j);
					j++;
				}
				else if(str[i].charAt(j)!=str[i].charAt(j+2)) 
				{
					//System.out.println(j);
					str2=str2+str[i].charAt(j)+str[i].charAt(j+2);
					j++;
					z=1;
				}	
		
	}
		 if(j==cmp)
			{
			     //System.out.println(j);
				str2=str2+str[i].charAt(j);
			}
		if(z==0)
		{
			str2=str2+"a";
		}
		
		//System.out.println(j);
		System.out.println(str2);
	}
	
}
	
}
