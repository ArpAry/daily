package codeforces;
import java.util.*;
public class RestoringTHeDuarationofTask {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t-->0)
		{
			int n=in.nextInt();
			int ar[]=new int[n];
			int br[]=new int[n];
			for(int i=0;i<n;i++)
				ar[i]=in.nextInt();
			
			for(int i=0;i<n;i++)
				br[i]=in.nextInt();
			
			System.out.print(br[0]-ar[0]+" ");
			for(int i=1;i<n;i++)
			{
				if(br[i-1]>ar[i])
					System.out.print(br[i]-br[i-1]+" ");
				else
					System.out.print(br[i]-ar[i]+" ");
					
			}
			System.out.println();
		}

	}

}
