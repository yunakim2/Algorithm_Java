package Bruteforce;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
//N과M(8) 
public class B_15657 {

	static int num[];
	static boolean c[];
	static int arr[];
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		num = new int[10];
		arr = new int[n];
		c = new boolean[10];
		st = new StringTokenizer(bf.readLine());
		for(int i =0 ; i<n ; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);;
		go(0,0,n,m);
	
		
		bw.close();

	}
	static void go(int index, int start, int n, int m) throws IOException
	{
		if(index == m)
		{
			for(int i =0 ;i<m; i++)
			{
				bw.write(num[i]+" ");
			}
			bw.write("\n");
			
			return ;
		}
		for(int i = start; i<n; i++)
		{
			//if(c[i]) continue;
			num[index] = arr[i];
			c[i] = true;
			go(index+1,i,n, m);
			c[i] = false;
			
		}
	}

}
