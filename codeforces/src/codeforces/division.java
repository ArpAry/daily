package codeforces;
import java.util.*;
public class division {
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			if(n>=1900)
				System.out.println("Division 1");
			else if(n<=1899&&n>=1600)
				System.out.println("Division 2");
			else if(n<=1599&&n>=1400)
				System.out.println("Division 3");
			else if(n<=1399)
				System.out.println("Division 4");
			
			t--;
		}
	}

}
