package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class B_1018 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B=0;
		int W=0;
		
		for(int i = 0 ; i<N; i++)
		{
			String s = bf.readLine();
			for(int j = 0 ; j<M; j++)
			{
				if(s.charAt(j)=='B') B++; 
				if(s.charAt(j)=='W') W++; 
			}
		}
		bw.write("B:"+B+"\n");
		bw.write("W:"+W+"\n");
		int num =chess(B,W);
		bw.write(num+" ");
		bw.close();

	}
	static int chess(int B, int W)
	{
		int count =0;
		if(B!=32)
		{
			count = 32-B;
		}
		if(W!=32)
		{
			count = 32-W;
		}
		return count;
		
	}
	

}
