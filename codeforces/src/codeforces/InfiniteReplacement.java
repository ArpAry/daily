package codeforces;
import java.util.*;
public class InfiniteReplacement {
	public static void main(String []args)
	{
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s=in.nextLine(),st=in.nextLine();
			int count=0;
			for(int i=0;i<st.length();i++)
			{
				if(st.charAt(i)=='a')
					count++;
			}
			if(count==1&&st.length()==1)
				System.out.println(1);
			else if(st.length()>1&&count>=1)
				System.out.println(-1);
			else 
			{
				double a=Math.pow(2,s.length());
				System.out.println((int)a);
			}
				
			t--;
		}
	}
	
}
