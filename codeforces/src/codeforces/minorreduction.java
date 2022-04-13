package codeforces;
import java.util.*;
public class minorreduction {
public static void main(String [] args)
{
	Scanner in =new Scanner(System.in);
	int t=in.nextInt();
	in.nextLine();
	while(t>0)
	{
		String s1=in.nextLine();
		int n1=s1.length();
		for(int i=n1-1;i>0;i--)
		{
			int max=s1.charAt(i)-48+s1.charAt(i-1)-48;
			//System.out.println(max);
			if(max>=10)
			{
				//System.out.print(i);
				System.out.println(s1.substring(0,i-1)+max+s1.substring(i+1,n1));
				break;
			}
			if(i==1&&max<10)
			{
			//	System.out.print("no");
			//	System.out.println(max);
				System.out.println(max+s1.substring(2,n1));
			}	
		}
		t--;
	}
}
	
}
