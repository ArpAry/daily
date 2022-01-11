package codeforces;
import java.util.*;

public class robotcleaner {

	public static void main(String [] args)
	{
		Scanner in =new Scanner(System.in);
		
		int n=in.nextInt();
	
		int ar[][] =new int[n][6];
		int i,j;
//		System.out.println(ar.length);
//		System.out.println(ar[0].length);
		
		
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar[0].length;j++)
			{
				ar[i][j]=in.nextInt();
				if(i==n&&j==6)
				break;	
					
			}
		}
		
		for(i=0;i<ar.length;i++)
		{
			int r,c,rr,rc,dirr,dirc;
		    r= ar[i][0];
		    c= ar[i][1];
    		rr=ar[i][2];
    		rc=ar[i][3];
    		dirr=ar[i][4];
    	    dirc= ar[i][5];
    	    System.out.printf("%d %d %d %d %d %d",ar[i][0],ar[i][1],ar[i][2],ar[i][3],ar[i][4],ar[i][5]);
    	   int count=0,dr=-1,dc=-1;
    	   while(rr!=dirr||rc!=dirc)
    	   {
    		   count++;
    		   rr+=dr;
    		   rc+=dc;
    		   if(rr==r||rr==1) dr*=-1;
    		   if(rc==c||rc==1) dc*=-1;
    	   }
    	   System.out.println(count);
    	   
    				
		}
		
	}

}
