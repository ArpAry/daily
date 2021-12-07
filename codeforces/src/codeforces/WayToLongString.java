package codeforces;
import java.util.*;

public class WayToLongString {

	public static void main(String[] args) {
		
		      
		      Scanner sc=new Scanner(System.in);
		      int n=sc.nextInt();
		      for(int i=0;i<n;i++)
		      {
		    	  
		         String str=sc.next();
		         int l=str.length();
		         if(l>10)
		         {
		            System.out.println(""+str.charAt(0)+(l-2)+str.charAt(l-1));
		         }
		         else
		         {
		            System.out.println(str);
		         }
		      }
		      
		   }
}	

	


