package codeforces;
import java.util.*;
public class Bwilliamthevigilant {
	public static  void main(String [] args)
	{
		Scanner in=new Scanner(System.in);
		int len=in.nextInt(),t=in.nextInt();
		in.nextLine();
		int count=0;

		String s1=in.nextLine();
		for(int i=0;i<len-2;i++)
		{
			if(s1.charAt(i)=='a'&&s1.charAt(i+1)=='b'&&s1.charAt(i+2)=='c')
			{
				count++;
			}
		}
		//System.out.println(count);
		while(t>0)
		{
			int n1=in.nextInt();
			char a=in.next().charAt(0);
			//System.out.println(s1);
			n1--;
			int st=Math.max(0,n1-2);
			int end=Math.min(len-1,n1+2);
			for(int i=st+1;i<end;i++)
			{
				if(s1.charAt(i-1)=='a'&&s1.charAt(i)=='b'&&s1.charAt(i+1)=='c')
					{
						count--;
					}
			}
			s1=s1.substring(0,n1)+a+s1.substring(n1+1,len);
			for(int i=st+1;i<end;i++)
			{
				if(s1.charAt(i-1)=='a'&&s1.charAt(i)=='b'&&s1.charAt(i+1)=='c')
					{
						count++;
					}
			}
			System.out.println(count);
			t--;
		}
		
		}
		
	
	
}
