package codeforces;
import java.util.*;
public class Xsum {
	public static void main(String [] args)
	{
		Scanner in=new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt(),m=in.nextInt();
			int ar[][]=new int[n][m]; 
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					ar[i][j]=in.nextInt();
				}
				
			}
//			for(int i=0;i<n;i++)
//			{
//				for(int j=0;j<m;j++)
//				{
//					System.out.println(ar[i][j]);
//				}
//				System.out.println("he");
//			}
			int max=0;
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					int cur=0,ci=i,cj=j;
			
					while(ci>=0&&ci<n&&cj>=0&&cj<m)
					{
						cur+=ar[ci][cj];
						ci--;
						cj--;
						
					}
					ci=i;cj=j;
					//System.out.println("1"+cur);
					while(ci>=0&&ci<n&&cj>=0&&cj<m)
					{
						cur+=ar[ci][cj];
						ci--;
						cj++;
						
					}
					ci=i;cj=j;
					//System.out.println("2"+cur);
	//				System.out.println(i+" "+j);
					while(ci>=0&&ci<n&&cj>=0&&cj<m)
					{
						cur+=ar[ci][cj];
						ci++;
						cj--;
						
					}
					ci=i;cj=j;
					//System.out.println("3"+cur);
					while(ci<n&&ci>=0&&cj<m&&cj>=0)
					{
						cur+=ar[ci][cj];
						ci++;
						cj++;
						
					}
					ci=i;cj=j;
					//System.out.println("4"+cur);
					cur-=ar[i][j]*3;
					max=Math.max(max, cur);
					
				}
			}
			System.out.println(max);
			t--;
		}
	}

}
