package codeforces;
import java.util.*;
public class stonesonthetable {

	public static void main(String[] args)
	{
		int n,i,j=0,k;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		in.nextLine();
		String str=in.nextLine();
		//k=str.length();
	for(i=0;i<n-1;i++)
		{
			if(str.charAt(i)==str.charAt(i+1))
			j++;
			
		}
	
		System.out.println(j);
	}
}
