package codeforces;
import java.util.*;
import java.io.*;

public class circularLocalMiniMax{
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
		 int n=in.nextInt();
			int ar[]=new int[n];
			int br[]=new int[n];
			
			for(int i=0;i<n;i++)
			{
				ar[i]=in.nextInt();
			}
			if((n&1)!=0)
			{
				out.println("NO");
			}
			else {
//				
				Arrays.sort(ar);
				int k=0;
				for(int i=0;i<n/2;i++)
				{
					br[k]=ar[i];
					k++;
					br[k]=ar[i+n/2] ;
					k++;
				}
				int count =1;
				
				for(int i=0;i<n-1;i++)
				{
					if(br[i]<br[i+1]&&(i&1)==0)
						count=0;
					else if(br[i]>br[i+1]&&(i&1)!=0)
						count=0;
					else 
					{
						count=1;
						out.println("NO");
						break;
					}
						
				}
				
//				for(int i=0;i<n;i++)
//		 			System.out.printf("%d ",br[i]);
					if(count==0)
					{
						if(br[n-1]<br[0])
						{
							out.println("NO");
						}
						else
					 	{
					 		out.println("YES");
					 		for(int i=0;i<n;i++)
					 			out.print(br[i]+" ");
					 		out.println("");
					 	}
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