package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;
//N과M (4)같은수여러번 골라도됨  
public class B_15652 {

	static int num[];
	static boolean c[];
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		num = new int[10];
		c = new boolean[10];
		
		go(0,1,n,m);
	
		
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
		for(int i = start; i<=n; i++)
		{
			//if(c[i]) continue;
			num[index] = i;
			c[i] = true;
			go(index+1,i,n, m);
			c[i] = false;
			
		}
	}

}
