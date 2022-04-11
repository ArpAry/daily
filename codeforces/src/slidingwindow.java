import java.util.*;
public class slidingwindow {
	
	
	public static void main(String [] args)
	{
		Scanner in =new Scanner(System.in);
		int t=in.nextInt();
		while(t>0)
		{
			in.nextLine();
			String T= in.nextLine(); 
			String P=in.nextLine();
			int Lt=T.length(); 
			int Lp=P.length();
			char ar[] =new char[Lt];
			for(int i=0;i<Lt;i++)
			{
				ar[i]=T.charAt(i);
			}
			char ch[]=new char[Lp];
			for(int j=0;j<Lp;j++)
			{
				ch[j]=P.charAt(j);
			}
			
//			System.out.println(Lt);
//			System.out.println(Lp);
			int r=Lp-1, l=0;
			while(r<Lt)
			{  
				int c=0;
				for(int j=0;j<=Lp-1;j++)
				{	
					//System.out.println("c");
						if(ar[l+j]!=ch[j])
					{	
						c=1;
						break;
					}
				}
				if(c==0)
				System.out.println(l);
				r++;l++;
			}
			t--;
}
		
	}
}
