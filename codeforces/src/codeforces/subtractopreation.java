package codeforces;
import java.util.*;

public class subtractopreation {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt(),k=in.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			a[i]=in.nextInt();
			
			Arrays.sort(a);
//			for(int i=0;i<n;i++)
//				System.out.println(a[i]);
		 System.out.println("case "+t);
			int l=0,h=n-1,count=0,cs=0;
			while(l<h)
			{
			//	System.out.println(ar[i]+"Hello");
			
					//System.out.println(ar[j]-ar[i]);
					
				    cs=a[l]+(-a[h]);
	                if(cs<k&&cs>0)
	                {
	                    l++;
	                    System.out.println(l+" case 1 "+h);
	                }
	                else if(cs>k&&cs>0)
	                {
	                    h--;
	                    System.out.println(l+" case 2 "+h);
	                }
	                else if(cs<k&&cs<0)
	                {
	                    h--;
	                    System.out.println(l+" case 3 "+h);
	                }
	                else if(cs>k&&cs<0)
	                {
	                    l++;
	                    System.out.println(l+" case 4 "+h);
	                }
	                else if(cs==k)
	                {
	                    System.out.println(l+" case 5 "+h);
	                    count=0;
	                //    System.out.println("YES");
	                    break;
	                }
				

			}
			if(count==1)
			{
				 System.out.println("YES");
			}
			if(count==0)
			{
				System.out.println("No");
			}
			t--;
			}
	}
	
}
