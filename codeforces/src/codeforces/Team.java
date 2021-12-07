
import java.util.*;
public class Team {
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
	int[][] ar=new int [n][3];
	int i,j,r,k=0;
	for(i=0;i<n;i++)
	{
		for(j=0;j<3;j++)
		{
			ar[i][j]=sc.nextInt();
		}
	}
	for(i=0;i<n;i++)
	{
		r=0;
		for(j=0;j<3;j++)
		{
			if(ar[i][j]==1)
			r++;
		}
		if(r>1)
		{
			k++;
		}
	}
	System.out.println(k);
		
		
		
	}

}
