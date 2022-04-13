import java.util.*;
public class football {
	public static void main(String [] args )
	{
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(i)==s1.charAt(i+1))
			{
				count++;
			}
			else
				count=0;
			
			if(count==6)
			{
				System.out.println("YES");
				break;
			}
			
		}
		if(count==0||count<6)
			System.out.println("NO");
	}
}
