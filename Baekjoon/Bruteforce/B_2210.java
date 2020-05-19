package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

/* 숫자판 점
 * 임의의 위치에서 인접한 네 방향으로 다섯 이동하면서 각칸에 있는 숫자를 차례로붙이
 */

public class B_2210 {
	
	static int n[][] = new int[5][5];
	static int dx[] = {0,-1,0,1};
	static int dy[] = {1,0,-1,0};
	static HashSet<Integer> ans = new HashSet<>();
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		for(int i =0 ; i<5; i++)
		{
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j =0 ; j<5; j++)
			{
				n[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}
		
		for(int i =0 ;i<5 ; i++)
		{
			for(int j = 0 ; j<5; j++)
			{
				go(i,j,n[i][j],1);
			}
		}
		
		bw.write(ans.size()+"\n");
		
		bw.close();

	}
	static void go(int x, int y, int num, int len)
	{
		if(len == 6) 
		{
			ans.add(num); 
			return;
		}
		for(int k =0 ; k<4; k++)
		{
			int nx = x+dx[k];
			int ny = y+dy[k];
			if(0<=nx && nx<5 && 0<=ny && ny<5)
			{
				go(nx,ny,num*10+n[nx][ny], len+1);
			}
		}
	}

}
