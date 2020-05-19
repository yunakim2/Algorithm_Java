package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class B_14501 {

	static int [] T;
	static int [] P;
	static int n;
	static int ans =0;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 n = Integer.parseInt(bf.readLine());

		T = new int [n+1];
		P = new int [n+1];
		for(int i =1 ; i<=n ; i++)
		{
		
			StringTokenizer st = new StringTokenizer(bf.readLine());
			T[i] = Integer.parseInt(st.nextToken());
			P[i] = Integer.parseInt(st.nextToken());
			
		}
		go(1,0);
		bw.write(ans+"\n");
		
		bw.close();

	}
	static void go(int day, int sum)
	{
		if(day ==n+1)
			{
			if(ans<sum) ans = sum;
				return;
			}
		if(day>n+1) return ;
		
		go(day+1,sum);
		go(day+T[day], sum+P[day]);
		
		
	}
	static int Max(int t1, int t2)
	{
		if(t1>t2) return t1;
		return t2;
	}

}
