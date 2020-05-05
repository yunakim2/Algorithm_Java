package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class B_7568 {

	static int weight [] ;
	static int height [];
	static int rank[];
	static int n;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		n = Integer.parseInt(bf.readLine());
		weight = new int[n];
		height = new int[n];
		rank = new int [n];
		for (int i =0 ; i<n; i++)
		{
			StringTokenizer st = new StringTokenizer(bf.readLine());
			weight[i] = Integer.parseInt(st.nextToken());
			height[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i =0 ;i<n; i++)
		{
			ranking(weight[i],height[i]);
		}
		for(int i = 0 ;i<n; i++)
		{
			bw.write((rank[i]+1)+" ");
		}
		
		bw.close();

	}
	static void ranking(int w, int h)
	{
		for(int i =0; i<n; i++)
		{
			if(w>weight[i])
			{
				if(h>height[i])
				{
					rank[i]++;
				}
			}
		}
	}

}

