package codeforces;
import java.util.*;
public class DetectiveTask {
	public static void main(String []args)
	{
		Scanner  in=new Scanner (System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
			String s1=in.nextLine();
			int  laz=s1.length()-1,ans=0;
			for(int i=s1.length()-1;i>=0;i--)
			{
				if(s1.charAt(i)=='0')
					laz=i;
			}
			for(int i=laz;i>=0;i--)
			{
				ans++;
				if(s1.charAt(i)=='1')
					break;
			}
			System.out.println(ans);
			t--;
		}
	}
}
