import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class B_2178 {
	static int map[][];
	static int checkbfs[][];
	
	static int [] dx = {-1,0,1,0};
	static int [] dy = {0,-1,0,1};
	static int N;
	static int M;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		checkbfs = new int[N][M];
		for(int i = 0 ; i<N ; i++) {
			String str = bf.readLine();
			for(int j =0 ; j<M ; j++) {
				map[i][j] =str.charAt(j)-'0';
			}
		}
		bfs(0,0);
		System.out.println(map[N-1][M-1]);

	}
	public static void bfs(int i, int j) {
		LinkedList<map> list = new LinkedList<map>();
		list.add(new map(i,j));
		checkbfs[i][j] =1;

		while(!list.isEmpty()) {
			map d = list.remove(0);
			for(int k = 0 ; k<4 ; k++) {
				int nextX = d.x + dx[k];
				int nextY = d.y + dy[k];
				
				if(nextX<0 || nextY <0 || nextX>=N || nextY>=M) {
					continue;
				}
				if(checkbfs[nextX][nextY]==1 || map[nextX][nextY]!=1) {
					continue;
				}
				
				list.add(new map(nextX,nextY));
				map[nextX][nextY] = map[d.x][d.y]+1;
				checkbfs[nextX][nextY] = 1;
			}
		}
	}

}
class map {
	int x;
	int y;
	map(int x, int y) {
		this.x =x;
		this.y =y;
	}
}
