package codeforces;
import java.util.*;
public class bitplusplus {
	public static void main(String[] args)
	{
		int m,i,j=0;
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		in.nextLine();
		String ar[]=new String[m];
		for(i=0;i<m;i++)
		{
			ar[i]=in.nextLine();
		}
		for(i=0;i<m;i++)
		{
			if(ar[i].equals("++X")||ar[i].equals("X++"))
				j++;
			else
				j--;
		}
		System.out.println(j);
	}

}
