package codeforces;
import java.util.*;
public class WayToLongString {
	   public static void main(String[] args )
	   {
	      Scanner in=new Scanner(System.in);
	      int n,i;
	      n=in.nextInt();
	      
	      String ar;
	      String arr=in.nextLine();
	      for(i=0;i<n;i++)
	      {
	         ar=in.nextLine();
	         int len=ar.length();
	         if(len>10)
	        {
	            int k=len-2;
	            System.out.println(""+ar.charAt(0)+k+ar.charAt(len-1));
	         }
	         else
	         {
	            System.out.println(ar );
	         }
	         //System.out.println(len);
	      }
	      
	   }


}
