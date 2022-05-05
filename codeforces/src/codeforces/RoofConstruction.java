package codeforces;
import java.util.*;
public class RoofConstruction {
	
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int t=in.nextInt();
	    while(t>0)
	    {
	        int n=in.nextInt();
	        int c=0,a=n-1;
	        while(a!=0)
	        {
	            a/=2;
	            c++;
	        }
	        int b=(int)Math.pow(2,c-1);
	       // System.out.println(b);
	        
	        for(int i=b-1;i>=0;i--)
	        {
	            System.out.print(i+" " );
	        }
	        for(int i=b;i<=n-1;i++)
	        {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	        t--;
	    }
	//	System.out.println("Hello World");
	}

}
