package codeforces;

import java.util.*;
import java.io.*;

public class Letter2String{
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
			int n=in.nextInt();
		//	in.nextLine();
			String s1[]=new String[n];
			for(int i=0;i<n;i++)
			s1[i]=in.next();
			
			long count=0;
			for(int i=0;i<n-1;i++)
			{
				char ch1=s1[i].charAt(0),ch2=s1[i].charAt(1);
			//	System.out.println("Hello world");
				for(int j=i+1;j<n;j++)
				{
					
					if(ch1==s1[j].charAt(0)&&ch2!=s1[j].charAt(1)||ch2==s1[j].charAt(1)&&ch1!=s1[j].charAt(0))
					{
						count++;
				//		System.out.println(s1[j]);
					}
					
				
				
//					if(ch2==s1[j].charAt(1)&&)
//					{
//						count++;
//					//	System.out.println(s1[j]);
//					}
				
				}
			}
			out.println(count);

		//writecode here	
            }
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}
