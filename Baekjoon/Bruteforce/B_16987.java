package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

/* 계란으로 계란치기 
 * 
 */

public class B_16987 {
	static int n;
	static int S[];
	static int W[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(bf.readLine());
		S = new int[n];
		W = new int[n];
		for(int i =0 ; i<n; i++)
		{
			StringTokenizer st = new StringTokenizer(bf.readLine());
			S[i] = Integer.parseInt(st.nextToken());
			W[i] = Integer.parseInt(st.nextToken());
			
		}
		
		bw.write(go(0)+"\n");
		
		
		bw.close();

	}
	
	static int go(int x)
	{
		if(x == n)
		{
			int cnt =0;
			for(int i =0 ; i<n; i++)
			{
				if(S[i]<=0) {cnt+=1;}
				
			}
			return cnt;
		}
		if(S[x]<=0) return go(x+1);
		
		int ans=0;
		boolean ok = false;
		
		for(int i =0 ; i<n ; i++)
		{
			int j = x;
			if(i == j) continue;
			if(S[i]<=0) continue;
			ok = true;
			S[i] -= W[j];
			S[j] -= W[i];
			
			int temp = go(x+1);
			
			if(ans<temp)
			{
				ans= temp;
			}
			S[i] += W[j];
			S[j] +=W[i];
		}
		if(!ok) return go(x+1);
		return ans;
	}

}
