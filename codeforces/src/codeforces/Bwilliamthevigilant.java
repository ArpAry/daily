package codeforces;
import java.util.*;
import java.io.*;

public class Bwilliamthevigilant{
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
           // int testCases=in.nextInt();
         //   while(testCases-- > 0){
                // write code here
		 // write code here
			
		//Scanner in=new Scanner(System.in);
		int len=in.nextInt(),t=in.nextInt();
		//in.nextLine();
		int count=0;
 
		String s1=in.next();
		for(int i=0;i<len-2;i++)
		{
			if(s1.charAt(i)=='a'&&s1.charAt(i+1)=='b'&&s1.charAt(i+2)=='c')
			{
				count++;
			}
		}
		//System.out.println(count);
		while(t>0)
		{
			int n1=in.nextInt();
			char a=in.next().charAt(0);
			//System.out.println(s1);
			n1--;
			int st=Math.max(0,n1-2);
			int end=Math.min(len-1,n1+2);
			for(int i=st+1;i<end;i++)
			{
				if(s1.charAt(i-1)=='a'&&s1.charAt(i)=='b'&&s1.charAt(i+1)=='c')
					{
						count--;
					}
			}
			s1=s1.substring(0,n1)+a+s1.substring(n1+1,len);
			for(int i=st+1;i<end;i++)
			{
				if(s1.charAt(i-1)=='a'&&s1.charAt(i)=='b'&&s1.charAt(i+1)=='c')
					{
						count++;
					}
			}
			out.println(count);
			t--;
		}
		

		//writecode here	
            //}
            out.close();
        } catch (Exception e) {
            return;
        }
    }
}

