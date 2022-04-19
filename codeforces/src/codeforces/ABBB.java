package codeforces;
import java.util.*;
public class ABBB {
	public static void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s1=in.nextLine();
			int n1=s1.length();
//			char ar[]=new char[n1];
//			ar[0]=s1.charAt(0);
//			int n2=n1,j=1;
//			while(n2>0)
//			{
//				if(s1.charAt(1)=='A'&&s1.charAt(1)=='A')
//				n2--;
//			}
			Stack<Character> stack = new Stack<Character>();
			for(int i=0;i<n1;i++)
			{
				if(stack.empty()==true)
				{
					stack.push(s1.charAt(i));
				}
				else if(s1.charAt(i)=='A')
				{
					stack.push(s1.charAt(i));
				}
				else if(s1.charAt(i)=='B'&&stack.lastElement()=='A')
				{
					stack.pop();
				}
				else if(s1.charAt(i)=='B'&&stack.lastElement()=='B')
				{
					stack.pop();
				}
				
			}
			System.out.println(stack.size());
			
			t--;
		}
	}

}
