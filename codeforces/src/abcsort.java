import java.util.*;
public class abcsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();
			int ar[]=new int [n];
			
			for(int i=0;i<n;i++)
				ar[i]=in.nextInt();
			
			int j=0,count=0;
			if((n&1)!=0)
			 j=1;
			for(int i=j;i<(n-1);i+=2)
			{
				if(ar[i]>ar[i+1])
				{
					ar[i]=ar[i]^ar[i+1];
					ar[i+1]=ar[i]^ar[i+1];
					ar[i]=ar[i]^ar[i+1];
				}
			}
			for(int i=0;i<n-1;i++)
			{ 	
				 if(ar[i]>ar[i+1])
				 {
					 count=1;
					 System.out.println("NO");
					 break;
				 }
				
			}
			if(count==0)
				System.out.println("YES");
		}
	}
}
