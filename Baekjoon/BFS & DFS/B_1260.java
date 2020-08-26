import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.io.*;
public class B_1260 {

	static int num [][] ;
	static int checkbfs[];
	static int checkdfs[];
	public static void main(String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		num = new int [N][N];
		checkbfs = new int[N];
		checkdfs = new int[N];
		
		for(int i = 0 ; i<M ; i++) {
			st = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(st.nextToken())-1;
			int m = Integer.parseInt(st.nextToken())-1;
			num[n][m] = 1;
			num[m][n] = 1;
		}
		dfs(0, N, --V);
		System.out.println("");
		bfs(N, V);

	}
	public static void bfs(int N, int V) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(V); 
		checkbfs[V] = 1;
		System.out.print(V+1+" ");
		int j = 0;
		
		while(!list.isEmpty()) {
			int n = list.remove(0);
			
			for(int i = 0 ; i<N ; i++) {
				if(num[n][i]==1 && checkbfs[i]!=1) {
					list.add(i);
					System.out.print(i+1+" ");
					checkbfs[i] = 1;
				}	
			}
		}
		return ;
	}
	
	public static void dfs(int i, int N, int V) {
		if(i == N) {
			return ; 
		} 
		if(checkdfs[V]==1) {
			return ;
		}
		checkdfs[V] = 1;
		System.out.print(V+1+" ");
		for(int j= 0 ;  j<N ; j++) {
			if(num[V][j]==1 && checkdfs[j]!=1) {
				dfs(i+1, N, j);
				
			}
		}
	}

}
