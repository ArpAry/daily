package codeforces;
import java.util.*;
public class Lucky {
	public static void main(String args[])
	{
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s1=in.nextLine();
			int a=s1.charAt(0)+s1.charAt(1)+s1.charAt(2);
			int b=s1.charAt(3)+s1.charAt(4)+s1.charAt(5);
			if(a==b)
				System.out.println("YES");
			else
				System.out.println("NO");
			t--;
		}
	}

}
