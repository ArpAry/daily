package codencode;
import java.util.*;
public class moduloinverse {
  
	static int inversemod(int a, int m)
    {
      
        for (int x = 1; x < m; x++)
            if (((a%m) * (x%m)) % m == 1)
                return x;
        return 1;
    }
	
	public static void main(String[] args) {
	
		Scanner in =new Scanner (System.in);
		int t=in.nextInt();
		while(t>0)
		{
			int a=in.nextInt();
			int m=in.nextInt();
//			a=a/2;
//			System.out.println(a);
			 int val=inversemod(a,m);
			 System.out.println("modulo inverse of "+a+" under "+m+" is "+val );
			t--;
		}

	}

}
