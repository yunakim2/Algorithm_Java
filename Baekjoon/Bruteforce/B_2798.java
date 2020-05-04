package Bruteforce;


import java.io.*;
import java.util.StringTokenizer;

public class B_2798 {

	static int S[];
	static int N;
	static int M;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		S = new int [N];
		
		st = new StringTokenizer(bf.readLine());
		for(int i = 0 ; i<N ; i++)
		{
			S[i] = Integer.parseInt(st.nextToken());
		}
		
		bw.write(blackjack(0,0,0)+" ");
		bw.close();

	}
	private static int blackjack(int sum, int idx, int cnt)
	{
		if(cnt ==3)
		{
			return sum>M?0:sum;
		}
		if(idx>=N) {
			return 0;
		}
		int max = 0;
		for(int i = idx; i<N; i++)
		{
			max = Math.max(max, blackjack(sum+S[i],i+1,cnt+1));
		}
		return max;
		
	}
}
