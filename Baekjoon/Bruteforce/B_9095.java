package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class B_9095 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(bf.readLine());
		
		for(int i =0 ; i<n ; i++)
		{
			int c = Integer.parseInt(bf.readLine());
			bw.write(go(0,0,c)+"");
			bw.write("\n");
		}
		
		bw.close();

	}
	static int go(int count, int sum, int goal)
	{
		if(sum > goal) return 0;
		if(sum == goal) return 1;
		int now =0;
		for(int i =1; i<=3; i++)
		{
			now+=go(count+1, sum+i , goal);
		}
		return now;
	}

}
