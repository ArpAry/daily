package codechef;
import java.util.*;

public class Codechef {
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner (System.in);
	    int t=in.nextInt();
	    for( int i=0;i<t;i++)
	    {
	       long input=in.nextLong();
	       int c=5;
	       long ans=0;
	       while(input/c>0)
	       {
	           ans=ans+(input/c);
	           c*=5;
	       }
	       System.out.println(ans);
	    }

	}
}
