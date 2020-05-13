package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;

public class B_1018 {

	static int map [][];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char[][] Test1 = {{'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'},
                {'W','B','W','B','W','B','W','B'},{'B','W','B','W','B','W','B','W'}};
		char[][] Test2 = {{'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'},
                {'B','W','B','W','B','W','B','W'},{'W','B','W','B','W','B','W','B'}};
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B=0;
		int W=0;
		map = new int[N][M];
		
		for(int i = 0 ; i<N; i++)
		{
			String s = bf.readLine();
			for(int j = 0 ; j<M; j++)
			{
				map[i][j] = s.charAt(j);
			}
		}
	
		
		
		bw.close();

	}
}
