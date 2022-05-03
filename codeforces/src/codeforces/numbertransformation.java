package codeforces;
import java.util.*;
public class numbertransformation {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0) {
		int x=in.nextInt(),y=in.nextInt();
		if(y%x==0)
		{
			System.out.println(1+" "+y/x);
		}
		else
		{
			System.out.println("0 0");
		}
			t--;
		}
	}
}
