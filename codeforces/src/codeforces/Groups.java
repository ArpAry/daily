package codeforces;
import java.util.*;
public class Groups {
	public static void main(String [] args ) {
	 Scanner in =new Scanner (System.in);
	 int t=in.nextInt();
	 while(t>0)
	 {
		 int  n=in.nextInt();
		 int ar[][]=new int [n][5];
		 for(int i=0;i<n;i++)
		 {
			 for(int j=0;j<5;j++)
				 ar[i][j]=in.nextInt();
		 }
		 int count=0;
		 for(int i=0;i<5;i++)
		 {
			 for(int j=0;j<5;j++)
			 {
				 int ci=0,cj=0,cmn=0;
				 count=0;
				 if(j!=i)
				 for(int z=0;z<n;z++)
				 {
					 if(ar[z][i]==1)
						 ci++;
					 if(ar[z][j]==1)
						 cj++;
					 if(ar[z][j]==1&&ar[z][i]==1)
						 cmn++; 
				 }		
				 if(ci>=n/2&&cj>=n/2&&ci+cj-cmn==n)
				 {
					 //System.out.println("YES");
					 count=1;
					 break;
				 }
				 
			 }
			 if(count==1)
				 break;
		 }
		 if(count==1)
		 {
		 	System.out.println("YES");
		 	//break;
		 }
		 else
		 {
		 	System.out.println("NO");
		 	//break;
		 }

		 
		 t--;
	 }
		
		
	}
}
