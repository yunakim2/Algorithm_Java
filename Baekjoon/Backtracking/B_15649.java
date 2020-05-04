package Backtracking;

import java.io.*;
import java.util.StringTokenizer;

public class B_15649 {

	static int arr[] ;
	static int visit[];
	static int N ;
	static int M ;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
	
		arr = new int[9]; 
		visit = new int[9];
		dfs(0);
	
		
		bw.close();

	}
	private static void dfs(int cnt) throws IOException
	{
		if(cnt == M) {
			for(int i = 0 ;i<M ; i++)
			{
				bw.write(arr[i]+" ");
			}
			bw.write("\n");
			
		return;
		}
		for(int i = 1; i<=N; i++)
		{
			if(visit[i]==1) continue;
			visit[i]=1;
			arr[cnt]=i;
			dfs(cnt+1);
			visit[i]=0;
		}
		
		
	}

}
