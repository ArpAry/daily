package codeforces;
import java.util.*;
public class circular_new_Array {
	public static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			int sort[]=new int[n];
			for(int i=0;i<n;i++)
			ar[i]=in.nextInt();
			
			//Arrays.sort(ar);
			
//			for(int i=0;i<n;i++)
//				System.out.println(ar[i]);
			int i=0,j=n-1,k=0,ct=0;
			while(i<j)
			{
				if(ar[i]<ar[j])
				{
					sort[k]=ar[i];
					k++;
					sort[k]=ar[j];
					k++;
					i++;
					j--;
				}
				else
				{
					System.out.println("NO");
					ct=1;
					break;
				}
				
			}
			if(ct==0)
				System.out.println("YES");
			
			
			t--;
		}
	}
}
