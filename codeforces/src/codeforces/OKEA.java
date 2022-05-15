package codeforces;
import java.util.*;
public class OKEA {
	 public static void main(String[]args)
	 {
		 Scanner in=new Scanner(System.in);
		 int t=in.nextInt();
		 while(t>0)
		 {
			 int n=in.nextInt(),k=in.nextInt();
			 if(k==1)
			 {
				 System.out.println("YES");
				 for(int i=0;i<n;i++)
				 {
					 System.out.println(i+1);
				 }
			 }
			 else {
				 int ev=2,od=1;
				int ar[][]=new int[n][k];
					 for(int i=0;i<n;i++)
					 {
						 for(int j=0;j<k;j++) {
							 if((i&1)==0)
							 {
								 ar[i][j]=ev;
								 ev+=2;
							 }
							 else{
								 ar[i][j]=od;
								 od+=2;
							 }
							 
						 }
					 }
					 //od-=2;
					 
					 if((ev-2)>(n*k)||(od-2)>(n*k))
					 {
						 System.out.println("NO");
					 }
			 else {
						 
					 System.out.println("YES");
					 for(int i=0;i<n;i++)
					 {
						 for(int j=0;j<k;j++)
						 {
							 System.out.print(ar[i][j]+" ");
						 }
						 System.out.println();
					  }
					}
			 }
			 t--;
		 }
	 }
	 
}
