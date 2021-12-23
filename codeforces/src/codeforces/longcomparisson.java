package codeforces;
import java.util.*;

public class longcomparisson {
	public static void main(String[] args)
	{
		
		Scanner in=new Scanner(System.in);
		long a=1,b=1,c=1,d=1,c1=0,c2=0;
		double sum1,sum2;
		int i,j=0;
		int n=in.nextInt();
		long ar[][]=new long[n][4];
		for(i=0;i<n;i++)
		{
			for(j=0;j<4;j++)
			{
				ar[i][j]=in.nextLong();
				//System.out.println(ar[i][j]);
			}
		}
		
		for(i=0;i<n;i++)
		{
		
					j=0;
					a=ar[i][j];
					while(a/10!=0)
					{
						a=a/10;
						c1++;
					}
					j++;
					b=ar[i][j];
					j++;
					c=ar[i][j];
					while(c/10!=0)
					{
						c=c/10;
						c2++;
					}
					j++;
					d=ar[i][j];
				//	System.out.println(a+"\n" +b+"\n" +c +"\n"+d );
					if(c1+b>c2+c)
					{
						System.out.println(">");	
					}
				    else if(c1+b<c2+c)
					{
						System.out.println("<");
		            }
					else 
					{
							sum1=ar[i][0];
							sum2=ar[i][2];
							
							double res1 =sum1/Math.pow(10,c1-1);
							double res2=sum2/Math.pow(10,c2-1);
						while(res1!=res2)
						{
							c1--;
							c2--;
						
							if(res1>res2&&b<d)
						{
							System.out.println(">");
							break;
					    }
						else if(res1<res2&&b>d)
						{
							System.out.println("<");
							break;
						}
						else if(c1==0||c2==0)
						{
							System.out.println("=");
							break;
						}
						
					}	
					}		
			       
		}
	}
	}
	
	
	