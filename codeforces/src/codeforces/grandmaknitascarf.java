package codeforces;
import java.util.*;
public class grandmaknitascarf {
	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int len=in.nextInt();
			in.nextLine();
			String s1=in.nextLine();
			
			int ar[]=new int[26];
			char ch[]=new char[26];
			int num=0;
			long min=len;
			for(int i=0;i<len;i++)
			{
				if(s1.charAt(i)>96&&s1.charAt(i)<123)
				{
					ar[s1.charAt(i)-97]++;
				}
				if(ar[s1.charAt(i)-97]==1)
				{
					ch[num]=s1.charAt(i);
					//System.out.println(ch[num]);
					num++;
				}
			}
			long ans=10000007;
			long count=0;
			for(int i=0;i<num;i++)
			{
				int low=0,high=len-1;
				count=0;
				while(low<high)
				{
					if(s1.charAt(low)==s1.charAt(high))
					{
						low++;high--;
						//System.out.println("case 1 "+ch[i]+count+" "+low+" "+high);
					}
					else if(s1.charAt(low)==ch[i])
					{
						low++;
						count++;
					//	System.out.println("case 2 "+ch[i]+count+" "+low+" "+high);
					}
					else if(s1.charAt(high)==ch[i])
					{
						high--;
						count++;
						//System.out.println("case 3 "+ch[i]+count+" "+low+" "+high);
					}
					else
					{
						count=10000007;
						break;
					}
				}
				System.out.println(count);
				ans=Math.min(ans,count);
		}
			//ans=Math.min(ans,count);
			if(count==ans&&ans!=0)
			System.out.println(-1);
			else if(count==ans&&ans==0)
				System.out.println(0);
			else
			System.out.println(ans);
	t--;
		}
		
	}
}
