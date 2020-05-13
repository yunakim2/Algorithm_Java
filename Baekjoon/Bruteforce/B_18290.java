package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;
//NM과K


public class B_18290 {
	static int [][]a = new int [10][10];
	static boolean [][]c = new boolean [10][10];
	static int n,m,k;
	static int ans = -10000000;
	static int[] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	

	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		for(int i =0 ; i<n ; i++)
		{
			 st = new StringTokenizer(bf.readLine());

			for(int j =0 ; j<m ; j++)
			{
				a[i][j] =  Integer.parseInt(st.nextToken());
			}
		}
		go(0,0,0,0);
		bw.write(ans+"\n");
		bw.close();

	}
	static void go(int px, int py, int cnt, int sum)
	{
		if(cnt == k)
		{
			if(ans<sum) ans = sum;
			return;
		}
		for(int x = px; x<n; x++)
		{
			for(int y =(x==px?py: 0);y<m; y++)
			{
				if(c[x][y]) continue;
				boolean ok = true;
				for(int i =0 ;i<4 ; i++)
				{
					int nx = x+dx[i];
					int ny = y+dy[i];
					if(0<=nx && nx<n && 0<= ny && ny<m)
					{
						if(c[nx][ny]) ok = false;
					}
				}
				if(ok)
				{
					c[x][y] = true;
					go(x,y, cnt+1, sum+a[x][y]);
					c[x][y] = false;
				}
				
			}
		}
	}

}
