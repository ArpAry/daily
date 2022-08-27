package codeforces;
import java.util.*;
import java.io.*;

public class EatingQueries{
    static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    static class FastWriter {
		private final BufferedWriter bw;

		public FastWriter() {
			this.bw = new BufferedWriter(new OutputStreamWriter(System.out));
		}

		public void print(Object object) throws IOException {
			bw.append("" + object);
		}

		public void println(Object object) throws IOException {
			print(object);
			bw.append("\n");
		}

		public void close() throws IOException {
			bw.close();
		}
	}
    public static void main(String[] args) {
        try {
            FastReader in=new FastReader();
            FastWriter out = new FastWriter();
            int testCases=in.nextInt();
            while(testCases-- > 0){
                // write code here
		 // write code here
            	int n=in.nextInt(),min=987654321,max=0;
    			int nc=in.nextInt();
    			int ar[]=new int[n];
    			for(int i=0;i<n;i++)
    			{
    				ar[i]=in.nextInt();
    				max=max+ar[i];
    			}
    			Arrays.sort(ar);
    			int numc=0;
    			for(int j=0;j<nc;j++)
    			 {
    				numc=in.nextInt();
    				if(numc<=ar[n-1])
    				{
    					out.println(1);
    				}
    				else if(numc>max)
    				{
    					out.println(-1);
    				}
    				else if(numc==max)
    					out.println(n);
    				else
    				{
    					int k=n-1,sum=0,count=0;
    					while(sum<numc)
    					{
    						sum+=ar[k];
    						k--;
    						count++;
    					}
    					out.println(count);
    				}
    					
    			 }

		//writecode here	
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

