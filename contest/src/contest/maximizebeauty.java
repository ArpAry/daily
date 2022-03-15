package contest;
import java.util.*;

public class maximizebeauty {
int	merge(int a[] ,int lo, int hi)
	{
		if(lo<hi)
		{
			int mid=(lo+hi)/2;
			mergesort(a[] lo  mid);
			mergesort(a[] mid+1 hi);
		}
	}
	
public static void main(String [] args)
{
	Scanner in =new Scanner (System.in);
	int n=in.nextInt(),k=in.nextInt();
	int ar[][]= new int [n][2];
	int a[]=new int [k];
	int minb=0;
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<2;j++)
		{
			ar[i][j]=in.nextInt();
			if(ar[i][1]<minb)
			{
				minb=ar[i][1];
			}
			if(i>n-k-1)
			{
				a[i]=ar[i][0];
			}
		}
	}
	
}
	
}
