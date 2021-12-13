package codeforces;

import java.util.Scanner;

public class PetyaandStrings {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String str1=in.nextLine();
		String str2=in.nextLine();
		if(str1.compareToIgnoreCase(str2)==0)
		System.out.println("0");
		else if(str1.compareToIgnoreCase(str2)>0)
			System.out.println("1");
		else
			System.out.println("-1");
	}
	

}
