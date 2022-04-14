import java.util.*;
public class PolynomialRollingHash {
public static void main(String [] args)
{Scanner in =new Scanner(System.in);
int t=in.nextInt();
while(t>0)
{
	in.nextLine();
	String str1=in.nextLine(),str2=in.nextLine();
	int n1=str1.length(),n2=str2.length();
	char ar1[]=new char[n1];
	char ar2[]=new char[n2];
	for(int i=0;i<n1;i++)
	{
		ar1[i]=str1.charAt(i);
	}
	for(int i=0;i<n2;i++)
	{
		ar2[i]=str2.charAt(i);
	}
	long value1=0,value2=0;
	long  mo=100000007; 
	int p=27;
	long p_pow=1;
	for(int i=0;i<n1;i++)
	{
		value1=(value1+(ar1[i]-'a')*p_pow)%mo;
		//System.out.println(value1);
		p_pow=(p_pow*p)%mo;
	}
	p_pow=1;
	for(int i=0;i<n2;i++)
	{
		value2=(value2+(ar2[i]-'a')*p_pow)%mo;
		//System.out.println(value2);
		p_pow=(p_pow*p)%mo;
	}
	if(value1==value2)	
		System.out.println(value1+" "+value2);
	else
		System.out.println("No");
	t--;
}
	
}
	
}
