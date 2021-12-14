package codeforces;
import java.util.*;
public class helpfulmaths {

public static void main(String [] args)
{
	Scanner in=new Scanner(System.in);

String str=in.nextLine();
int ar[]=new int[50];
int m=0,j=0,temp=0;
int k=str.length();
int i=0;
for(i=0;i<k;i+=1)
{
	if(str.charAt(i)!='+')
	{
		ar[m]=str.charAt(i)-48;
		m++;
	}

}
	for(i=0;i<m-1;i++)
	{
		for(j=0;j<m-i-1;j++)
		{
			if(ar[j]>ar[j+1])
			{
				temp=ar[j+1];
				ar[j+1]=ar[j];
				ar[j]=temp;
			}
		}
			
	}
	
	for(i=0;i<m;i++)
	{
		System.out.print(ar[i]);
		if(i!=m-1)
		System.out.print("+");
	}
	

	}
	
}


