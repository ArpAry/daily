import java.util.*;
public class atranslation {

	public static void main (String [] args)
	{
		Scanner in =new Scanner(System.in);
		String s1=in.nextLine() , s2=in.nextLine();
		int n1=s1.length(),n2=s2.length();		
		if(n1==n2)
		{
			for(int i=0;i<n1;i++)
			{
				if(s1.charAt(i)==s2.charAt(n1-i-1))
				{
					System.out.println("YES");
				}
			}
		}
		else
		{
			System.out.println("NO");
		}
		
	}
	
}
