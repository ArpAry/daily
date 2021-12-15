package codeforces;
import java.util.*;

public class wordcapitalization {
	public static void main(String [] args)
	{
	Scanner in=new Scanner(System.in);
	String ar=in.nextLine();
	char b[]=new char[2000];
	int k;
	char a=ar.charAt(0);
	if((int)a>=97)
	{
		k=a-32;
		b[0]=(char)k;
	}
	else
		b[0]=a;
	for(int i=1;i<ar.length();i++)
	{
		b[i]=ar.charAt(i);
	}
		
	
	for(int i=0;i<ar.length();i++)
	{
		System.out.print(b[i]);
	}
	}

	
}
