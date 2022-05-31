package codeforces;
import java.util.*;
public class DigitMinimization {
	public static void main(String []args )
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		while(t>0)
		{
				String s=in.nextLine();
				//in.nextLine();
				//int n2=in.nextInt();
				if(s.length()==2)
					System.out.println(s.charAt(1));
				else
				{ 
					int min=-1;
					for(int i=0;i<(s.length());i++)
					{
						if(s.charAt(i)>s.charAt(i+1))
						{
							min=i+1;
						}
						
					}
					System.out.println(min);
				}
							t--;
		}
	}}

