package Bruteforce;

import java.io.*;
import java.util.StringTokenizer;
//선택으로 문제 풀기 
public class B_15650_2 {

	static int num[];
	
	static BufferedWriter bw;
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		num = new int[10];
		
		
		go(1,0,n,m);
	
		
		bw.close();

	}
	static void go(int index,int selected, int n, int m) throws IOException
	{
		if(selected == m)
		{
			for(int i =0 ;i<m; i++)
			{
				bw.write(num[i]+" ");
			}
			bw.write("\n");
			
			return ;
		}
		//모두다 X 인경
		if(index>n) return; 
		num[selected] = index;
		go(index+1, selected+1, n, m); //index 선택 
		num[selected] =0;
		go(index+1, selected,n,m); //index 선택 x
		
	}

}
