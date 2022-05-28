package codeforces;
import java.util.*;
public class AndSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int n=in.nextInt();
			int ans=(1<<20)-1,x=0;
			for(int i=0;i<n;i++)
			 {
				x=in.nextInt();
				if(x!=i)
					ans&=i;
			}
			
			System.out.println(ans);
			
			t--;
		}
	}

}
