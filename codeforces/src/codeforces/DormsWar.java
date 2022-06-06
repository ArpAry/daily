package codeforces;
import java.util.*;
public class DormsWar {
	public static void main(String []args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			in.nextLine();
			String s1=in.nextLine();
			//in.nextLine();
			int k=in.nextInt();
			char ar[]=new char[k];
			for(int i=0;i<k;i++)
				ar[i]=in.next().charAt(0);
//			for(int i=0;i<k;i++)
//				System.out.println(ar[i]);
			int ans=0,last=-1;
			for(int i=n-1;i>=0;i--)
			{
				if(last!=-1)
				ans=Math.max(last-i, ans);
					for(int j=0;j<k;j++)
					{
						if(s1.charAt(i)==ar[j])
						{	last=i;
						//System.out.println(last+" "+i );
						}
					}	
			}
			System.out.println(ans);
			t--;
		}
	}
}
