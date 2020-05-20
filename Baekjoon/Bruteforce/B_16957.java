package Bruteforce;
import java.io.*;
import java.util.StringTokenizer;
import java.util.*;

/* 체스판 위의 공 
 * 크기가 R,C 인 체스한에 인접한 8 방향으로 적힌 모든 정수가 현재 칸에 적힌 수보다 크면 이동을 멈춘다.
 */

public class B_16957 {
	static int r;
	static int c;
	static int dx[] = {1,-1,0,0,1,1,-1,-1};
	static int dy[] = {0,0,1,-1,1,-1,1,-1};
	static int parent[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		int n[][] = new int[r][c];
		int res[] = new int [r*c];
		parent = new int[r*c];
		for(int i = 0 ; i<r; i++)
		{
			st = new StringTokenizer(bf.readLine());
			for(int j = 0 ; j<c ; j++)
			{
				n[i][j] = Integer.parseInt(st.nextToken());
				
			}
		}
		
		   for (int i=0; i<r; i++) {
	            for (int j=0; j<c; j++) {
	                int x = i;
	                int y = j;
	                for (int k=0; k<8; k++) {
	                    int nx = i+dx[k];
	                    int ny = j+dy[k];
	                    if (0 <= nx && nx < r && 0 <= ny && ny < c)
	                        if (n[nx][ny] < n[x][y]) {
	                            x = nx;
	                            y = ny;
	                        }
	                }
	                parent[i*c+j] = x*c+y;
	            }
	        }
		for(int i = 0 ; i<r ; i++)
		{
			for(int j=0 ; j<c; j++)
			{
				res[go(i*c+j)] +=1;
 			}
		}
		for(int i =0 ; i<r ; i++)
		{
			for(int j = 0 ; j<c ; j++)
			{
				bw.write(res[i*c+j]+" ");
			}
			bw.write("\n");
		}
		
		bw.close();

	}
	
	static int go(int x)
	{
		if(parent[x]==x) return x;
		else
		{
			return parent[x] = go(parent[x]);
		}
	}

}
