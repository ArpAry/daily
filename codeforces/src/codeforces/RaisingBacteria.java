package codeforces;
import java.util.*;
public class RaisingBacteria {
	public static void main (String [] args)
	{
		Scanner in =new Scanner (System.in);
	
			int count=0,n=in.nextInt();
			while(n!=0)
			{
				n&=(n-1);
				count++;
			}
			System.out.println(count);
			
		
		
		
	}
}
