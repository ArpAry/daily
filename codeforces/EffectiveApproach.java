import java.util.*;
public class EffectiveApproach{
    public static void main(String [] args)
    {
        Scanner in=new Scanner (System.in);
    int n=in.nextInt();
    int ar1[] =new int[n+1];
    int ar2[]=new int[n+1];
    for(int i=1,j=n; i<=n &&j>=1;i++,j--)
     {
        int a=in.nextInt();
        ar1[a]=i;
        ar2[a]=j;
     }   
     int m=in.nextInt();
     long c1=0,c2=0;
     while(m>0)
     {
        int x=in.nextInt();
        c1=c1+ar1[x];
        c2=c2+ar2[x];

        m--;
     }
   
    
    System.out.println(c1+" "+c2);
    }
}