package codeforces;
import java.util.*;
public class dictionary {
	public  static void main(String []args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		in.nextLine();
		String Finstr[]=new String[650];
		int n=0;
		// str[][]=new String[26][25];
		for(int i=97;i<=122;i++)
		{
			int k=0;
			char a=(char)i;
			for(int j=97;j<=122;j++)
			{
				if(i==j)
				{
					continue;
				}
				else {
					char b=(char)j;
					Finstr[n]=""+a+b;
					n++;
					k++;	
				}
				
			}
		}
//		for(int z=0;z<=650;z++)
//		{
//			System.out.println(""+z+Finstr[z]);
//		}
		while(t>0)
		{
			String s=in.nextLine();
			for(int i=0;i<650;i++)
			{
				if(s.equals(Finstr[i]))
				{
					System.out.println(i+1);
					break;
				}
			}
			t--;
		}
	}
}
